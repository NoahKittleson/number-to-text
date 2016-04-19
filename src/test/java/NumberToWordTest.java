import org.junit.*;
import static org.junit.Assert.*;

public class NumberToWordTest {

  @Test
  public void convertNumber_ConvertsASingleDigitNumberToText_SingleDigit() {
    NumberToWord testNumberToWord = new NumberToWord();
    assertEquals("one", testNumberToWord.convert(1));
  }

  @Test
  public void convertNumber_ConvertsATwoDigitNumberToText_BelowTwenty() {
  NumberToWord testNumberToWord = new NumberToWord();
  //assertEquals("fifteen", testNumberToWord.convert(15));
  assertEquals("seventytwo", testNumberToWord.convert(72));
  }

  @Test
  public void convertNumber_ConvertsAThreeDigitNumberToText_BelowThousand() {
  NumberToWord testNumberToWord = new NumberToWord();
  //assertEquals("fifteen", testNumberToWord.convert(15));
  assertEquals("sevenhundredtwentytwo", testNumberToWord.convert(722));
  }
}
