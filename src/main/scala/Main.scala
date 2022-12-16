import scala.io.Source

val day1File = "./inputs/day1.txt"
val day2File = "./inputs/day2.txt"
val day3File = "./inputs/day3.txt"
val day4File = "./inputs/day4.txt"

@main def day1: Unit = 
  var inputs = Source.fromFile(day1File).getLines.toList
  var elfs = splitInputToElfs(inputs)
  var calloriesOfElves = elfs
    .map(e => calculateTotalCallories(e))
    .sorted
    .reverse

  println("elf with most calories: " + calloriesOfElves.head)

  var calloriesOfTopThreeElves = calloriesOfElves
    .take(3)
    .reduce(_+_)
  
  println("callories of top 3 elves: " + calloriesOfTopThreeElves)

@main def day2: Unit = 
  var inputs = Source.fromFile(day2File).getLines.toList
  
  println("part 1 total score will be: " + solveDay2Part1(inputs))
  println("part 2 total score will be: " + solveDay2Part2(inputs))

@main def day3: Unit = 
  var inputs = Source.fromFile(day3File).getLines.toList
  
  println("part 1 total score will be: " + solveDay3Part1(inputs))
  println("part 2 total score will be: " + solveDay3Part2(inputs))

@main def day4: Unit = 
  var inputs = Source.fromFile(day4File).getLines.toList
  
  println("part 1 total score will be: " + solveDay4Part1(inputs))
  println("part 2 total score will be: " + solveDay4Part2(inputs))
