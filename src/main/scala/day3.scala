import scala.compiletime.ops.string

var types = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
def getPriority(a: String): Int = 
    types.indexOf(a) + 1


def solveDay3Part1(xs: Seq[String]): Int =
    xs
      .map(x => x splitAt (x.length / 2))
      .flatMap((xs,ys) =>
        var ret = Seq[String]()
        for (x <- xs; y <- ys) {
            if (x == y) ret :+= x.toString
        }
        ret.foldLeft(Seq[String]())((acc, x) => 
            if (acc.contains(x)) acc else acc :+ x
        )
      )
      .map(getPriority)
      .reduce(_+_)

def solveDay3Part2(xs: Seq[String]): Int =
    xs
      .foldLeft(Seq(Seq[String]()))((acc, x) => acc.head match {
        case Seq(_,_,_) => Seq(x) +: acc
        case _ => (x +: acc.head) +: acc.tail
      })
      .flatMap( xs =>
        var ret = Seq[String]()
        for (x <- xs.head; y <- xs.tail.head; z <- xs.tail.tail.head) {
            if (x == y && y == z) ret :+= x.toString
        }
        ret.foldLeft(Seq[String]())((acc, x) => 
            if (acc.contains(x)) acc else acc :+ x
        )
      )
      .map(getPriority)
      .reduce(_+_)