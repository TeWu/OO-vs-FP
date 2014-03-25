module FunctionalSolution where

 {--
      Rozwiązanie:
         > Każdy rodzaj człowieka (dziecko, student i profesor) zdefiniowany jest jako osobny typ danych.
         > Funkcje operujące tylko na jednym rodzaju człowieka (funkcje play i thinkHard) przyjmują jako argument
           konkretny typ danych reprezentujący ten jeden rodzaj człowieka.
         > Funkcje operujące na dwóch lub więcej rodzajach ludzi (funkcje say i think) zdefiniowane jako funkcje
           typeclassy. Dla każdego rodzaju człowieka, który może być przekazany do takiej funkcji jest zdefiniowana
           instancja odpowiedniej typeclassy.
  --}


  -- Data model
  data Child   = Child   String
  data Student = Student String String Int
  data Prof    = Prof    String String


  -- Function 1) For all persons
  class Person a where
      say :: a -> String

  instance Person Child where
      say (Child name)       = name ++ " said: Bleeeaahhgaaa"
  instance Person Student where
      say (Student name _ _) = name ++ " said: Blee"
  instance Person Prof where
      say (Prof name _)      = name ++ " said: Let Ble be true"


  -- Function 2) Only for Adults
  class Adult a where
      think :: a -> String

  instance Adult Student where
      think (Student name hobby _) = name ++ " thought: 15 min and we're playing " ++ hobby
  instance Adult Prof where
      think (Prof name hobby)      = name ++ " thought: I'm not too old for " ++ hobby ++ ", am I?"


  -- Function 3) Only for Students
  play :: Student -> String
  play (Student name hobby frags) =  name ++ " aleready fragged " ++ (show frags) ++ " losers in " ++ hobby


  -- Function 4) Only for Profs
  thinkHard :: Prof -> String
  thinkHard (Prof name _) = name ++ " just discovered cure for everything"


  -- Main & helpers
  timmy  = Child "Timmy"
  tom    = Student "Tom" "CS" 4
  thomas = Prof "Thomas" "CS"

  main = do putStrLn $ say timmy
            putStrLn $ say tom
            putStrLn $ say thomas
            putStrLn $ ""
            -- putStrLn $ think timmy  -- Compile Time Error
            putStrLn $ think tom
            putStrLn $ think thomas
            putStrLn $ ""
            -- putStrLn $ play timmy  -- Compile Time Error
            putStrLn $ play tom
            -- putStrLn $ play thomas  -- Compile Time Error
            putStrLn $ ""
            -- putStrLn $ thinkHard timmy  -- Compile Time Error
            -- putStrLn $ thinkHard tom  -- Compile Time Error
            putStrLn $ thinkHard thomas


  