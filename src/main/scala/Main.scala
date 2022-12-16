import scala.io.Source

val day1File = "./inputs/day1.txt"

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
