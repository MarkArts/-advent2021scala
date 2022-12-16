import org.junit.Test
import org.junit.Assert.*

class TestDay2:
  @Test def test_example_1(): Unit =
    var input = Seq(
        "A Y",
        "B X",
        "C Z",
    )

    assertEquals(15, solveDay2Part1(input))

  @Test def test_example_2(): Unit =
    var input = Seq(
        "A Y",
        "B X",
        "C Z",
    )

    assertEquals(12, solveDay2Part2(input))