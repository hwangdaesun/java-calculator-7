package calculator.util;

import java.util.Arrays;

public class PositiveNumberConverter {
    public static int[] convertToInt(String... strNums) {
        return Arrays.stream(strNums).mapToInt(strNum -> Integer.parseInt(strNum)).toArray();
    }
}
