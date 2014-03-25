object FPSolution {

  /**
   * Rozwiązanie w paradygmacie programowania funkcyjnego
   * Po więcej info zobacz wersje w Haskellu
   */

  // Data model
  case class Child(name: String)
  case class Student(name: String, hobby: String, frags: Int)
  case class Prof(name: String, hobby: String)


  // Function 1) For all persons
  sealed trait Person[A] {
    def say(a: A): String
  }
  object Person {def apply[A](implicit p: Person[A]): Person[A] = p}

  implicit val personChild = new Person[Child] {
    def say(child: Child) = child.name + " said: Bleeeaahhgaaa"
  }
  implicit val personStudent = new Person[Student] {
    def say(stud: Student) = stud.name + " said: Blee"
  }
  implicit val personProf = new Person[Prof] {
    def say(prof: Prof) = prof.name + " said: Let Ble be true"
  }


  // Function 2) Only for Adults
  sealed trait Adult[A] {
    def think(a: A): String
  }
  object Adult {def apply[A](implicit a: Adult[A]): Adult[A] = a}

  implicit val adultStudent = new Adult[Student] {
    def think(stud: Student) = stud.name + " thought: 15 min and we're playing " + stud.hobby
  }
  implicit val adultProf = new Adult[Prof] {
    def think(prof: Prof) = prof.name + " thought: I'm not too old for " + prof.hobby + ", am I?"
  }


  // Function 3) Only for Students
  def play(stud: Student) = stud.name + " aleready fragged " + stud.frags + " losers in " + stud.hobby


  // Function 4) Only for Profs
  def thinkHard(prof: Prof) = prof.name + " just discovered cure for everything"



  // Main & helpers
  def main(args: Array[String]) {
    val timmy = Child("Timmy")
    val tom = Student("Tom", "CS", 4)
    val thomas = Prof("Thomas", "CS")

    val pc = Person[Child]
    val ps = Person[Student]
    val pp = Person[Prof]
    // val ac = Adult[Child]  // Compile Time Error (but not highlighted in IDE (IDEA))
    val as = Adult[Student]
    val ap = Adult[Prof]

    println(pc.say(timmy))
    println(ps.say(tom))
    println(pp.say(thomas))
    println()
    // println(ac.think(timmy))
    println(as.think(tom))
    println(ap.think(thomas))
    println()
    // println(timmy.play())  // Compile Time Error
    println(play(tom))
    // println(thomas.play())  // Compile Time Error
    println()
    // println(thinkHard(timmy))  // Compile Time Error
    // println(thinkHard(tom))  // Compile Time Error
    println(thinkHard(thomas))
  }
}
