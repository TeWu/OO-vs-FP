object OOSolution {

  /**
   * Rozwiązanie w paradygmacie programowania zorientowanego obiektowo
   */

  abstract class Person(val name: String) {
    // Function 1) For all persons
    def say(): String
  }


  class Child(name: String) extends Person(name) {
    // Function 1) For all persons
    override def say() = s"$name said: Bleeeaahhgaaa"
  }


  abstract class Adult(name: String, hobby: String) extends Person(name) {
    def think(): String
  }


  class Student(name: String, hobby: String, frags: Int) extends Adult(name, hobby) {
    // Function 1) For all persons
    def say() = s"$name said: Blee"
    def think() = s"$name thought: 15 min and we're playing $hobby"
    def play() = s"$name aleready fragged $frags losers in $hobby"
  }


  class Prof(name: String, hobby: String) extends Adult(name, hobby) {
    // Function 1) For all persons
    def say() = s"$name said: Let Ble be true"
    def think() = s"$name thought: I'm not too old for $hobby, am I?"
    def thinkHard() = s"$name just discovered cure for everything"
  }



  def main(args: Array[String]) {
    val timmy = new Child("Timmy")
    val tom = new Student("Tom", "CS", 4)
    val thomas = new Prof("Thomas", "CS")

    println(timmy.say())
    println(tom.say())
    println(thomas.say())
    println()
    // println(timmy.think())  // Compile Time Error
    println(tom.think())
    println(thomas.think())
    println()
    // println(timmy.play())  // Compile Time Error
    println(tom.play())
    // println(thomas.play())  // Compile Time Error
    println()
    // println(timmy.thinkHard())  // Compile Time Error
    // println(tom.thinkHard())  // Compile Time Error
    println(thomas.thinkHard())
  }
}
