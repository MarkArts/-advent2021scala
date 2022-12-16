import org.junit.Test
import org.junit.Assert.*

class TestDay4:
  @Test def test_example_1(): Unit =
    var input = Seq(
        "2-4,6-8",
        "2-3,4-5",
        "5-7,7-9",
        "2-8,3-7",
        "6-6,4-6",
        "2-6,4-8",
    )

    assertEquals(1, solveDay4Part1(input))


  @Test def test_example_2(): Unit =
    var input = Seq(
        "2-4,6-8",
        "2-3,4-5",
        "5-7,7-9",
        "2-8,3-7",
        "6-6,4-6",
        "2-6,4-8",
    )

    assertEquals(4, solveDay4Part2(input))    
