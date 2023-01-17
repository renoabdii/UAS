import java.util.Arrays;
import java.util.stream.Stream;

public class ujites {
    public static String Highlow(String numbers) {
        String[] NUMBERS = numbers.split("");
        int[] myNumber = new int[NUMBERS.length];
        for (int index = 0; index < NUMBERS.length; index++) {
            myNumber[index] = Integer.parseInt(NUMBERS[index]);
        }
        Arrays.sort(myNumber);
        String max = String.valueOf(Arrays.stream(myNumber).max());
        String min = String.valueOf(Arrays.stream(myNumber).min());
        return max + " " + min;


        }
    }
