
def solveDay4Part1(xs: Seq[String]): Int =
    xs.map(x => x.split(",").map(y => y.split("-")))
      .map(x => ((x.head.head, x.head.tail.head), (x.tail.head.head, x.tail.head.tail.head)))
      .map(x => ((x._1._1.toInt, x._1._2.toInt), (x._2._1.toInt, x._2._2.toInt)))
      .filter(aContainsB)
      .length

def solveDay4Part2(xs: Seq[String]): Int =
    xs.map(x => x.split(",").map(y => y.split("-")))
      .map(x => ((x.head.head, x.head.tail.head), (x.tail.head.head, x.tail.head.tail.head)))
      .map(x => ((x._1._1.toInt, x._1._2.toInt), (x._2._1.toInt, x._2._2.toInt)))
      .filter(aOverlapsWithB)
      .length

def aContainsB(x: ((Int, Int), (Int, Int))): Boolean =
    if (x._1._1 >= x._2._1 && x._1._2 <= x._2._2) return true
    if (x._2._1 >= x._1._1 && x._2._2 <= x._1._2) return true
    return false

def aOverlapsWithB(x: ((Int, Int), (Int, Int))): Boolean =
    if (x._1._1 >= x._2._1 && x._1._1 <= x._2._2) return true
    if (x._1._2 >= x._2._1 && x._1._2 <= x._2._2) return true
    if (x._2._1 >= x._1._1 && x._2._1 <= x._1._2) return true
    if (x._2._2 >= x._1._1 && x._2._2 <= x._1._2) return true
    return false