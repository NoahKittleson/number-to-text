import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.io.Console;

public class NumberToWord {

  public static Integer findMax(Integer[] array, Integer upperbound) {
    Integer currentMax = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] > currentMax && array[i] < upperbound) {
        currentMax = array[i];
      }
    }
    return currentMax;
  }

  public static String convert(Integer number) {
    HashMap<Integer, String> digitMap = new HashMap<Integer, String>();
    Console myConsole = System.console();
    digitMap.put(1, "one");
    digitMap.put(2, "two");
    digitMap.put(3, "three");
    digitMap.put(4, "four");
    digitMap.put(5, "five");
    digitMap.put(6, "six");
    digitMap.put(7, "seven");
    digitMap.put(8, "eight");
    digitMap.put(9, "nine");
    digitMap.put(10, "ten");
    digitMap.put(11, "eleven");
    digitMap.put(12, "twelve");
    digitMap.put(13, "thirteen");
    digitMap.put(14, "fourteen");
    digitMap.put(15, "fifteen");
    digitMap.put(16, "sixteen");
    digitMap.put(17, "seventeen");
    digitMap.put(18, "eighteen");
    digitMap.put(19, "nineteen");
    digitMap.put(20, "twenty");
    digitMap.put(30, "thirty");
    digitMap.put(40, "forty");
    digitMap.put(50, "fifty");
    digitMap.put(60, "sixty");
    digitMap.put(70, "seventy");
    digitMap.put(80, "eighty");
    digitMap.put(90, "ninety");

    HashMap<Integer, String> bigDigitMap = new HashMap<Integer, String>();
    bigDigitMap.put(100, "hundred");
    bigDigitMap.put(1000, "thousand");
    bigDigitMap.put(1000000, "million");
    bigDigitMap.put(1000000000, "billion");

    String finalString = "";

    if (number > 100) {
      Set<Integer> keyArray = bigDigitMap.keySet();
      Integer[] testArray = keyArray.toArray(new Integer[bigDigitMap.size()]);
      Integer max = findMax(testArray, number);
      for (int i = 1; i * max < number; i++;) {
        
      }
    }







    while (number != 0) {
      if (digitMap.containsKey(number)) {
        finalString = finalString.concat(digitMap.get(number));
        number = 0;
      } else {
        Set<Integer> keyArray = digitMap.keySet();
        Integer[] testArray = keyArray.toArray(new Integer[digitMap.size()]);
        Integer max = findMax(testArray, number);
        finalString = finalString.concat(digitMap.get(max));
        number = number - max;
      }
    }
    return finalString;


      // for (int i = 0; i < digitMap.size(); i++) {
      //   System.out.println(testArray[i]);
      //   if (number > testArray[i] && number < testArray[i+1]) {
      //     return digitMap.get(testArray[i]);
      //   }
      // }
      //divide number and build string from parts?
    // }
    // return "zero";
  }
}
