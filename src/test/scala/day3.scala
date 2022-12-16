import org.junit.Test
import org.junit.Assert.*

class TestDay3:
  @Test def test_priority(): Unit =
    assertEquals(1, getPriority("a"))
    assertEquals(16, getPriority("p"))
    assertEquals(27, getPriority("A"))
    assertEquals(38, getPriority("L"))
    assertEquals(42, getPriority("P"))
    assertEquals(52, getPriority("Z"))

  @Test def test_example_1(): Unit =
    var input = Seq(
        "vJrwpWtwJgWrhcsFMMfFFhFp",
        "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
        "PmmdzqPrVvPwwTWBwg",
        "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
        "ttgJtRGJQctTZtZT",
        "CrZsJsPPZsGzwwsLwLmpwMDw",
    )

    assertEquals(157, solveDay3Part1(input))


  @Test def test_example_2(): Unit =
    var input = Seq(
        "vJrwpWtwJgWrhcsFMMfFFhFp",
        "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
        "PmmdzqPrVvPwwTWBwg",
        "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
        "ttgJtRGJQctTZtZT",
        "CrZsJsPPZsGzwwsLwLmpwMDw",
    )

    assertEquals(70, solveDay3Part2(input))    
