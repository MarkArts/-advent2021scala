type Elf = Seq[String]
def splitInputToElfs(input: Seq[String]): Seq[Elf] = 
  input.foldLeft(Seq(Seq[String]()))((acc, x) => 
    x match {
      case "" => Seq[String]() +: acc
      case _ => (x +: acc.head) +: acc.tail
    }
  )

def calculateTotalCallories(elf: Elf): Int =
  elf.map(m => m.toInt).reduce((a,b) => a+b)
