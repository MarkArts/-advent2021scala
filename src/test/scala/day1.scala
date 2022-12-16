import org.junit.Test
import org.junit.Assert.*

class Day1:
  @Test def test_split_input(): Unit =
    var input = Seq("1234", "5678", "", "123", "456", "", "12", "34", "56")

    assertEquals(Seq(
      Seq("56", "34", "12"),
      Seq("456", "123"),
      Seq("5678", "1234"),
    ),splitInputToElfs(input))
  
  @Test def test_total_values(): Unit =
    assertEquals(
      calculateTotalCallories(Seq("1","2","3")),
      6
    )