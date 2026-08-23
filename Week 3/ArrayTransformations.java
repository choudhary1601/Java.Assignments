import java.util.Scanner;

public class ArrayTransformations {

    static void reverseInPlace(int[] values) {
        int i = 0;
        int j = values.length - 1;

        while (i < j) {
            int temp = values[i];
            values[i] = values[j];
            values[j] = temp;
            i++;
            j--;
        }
    }

    static int[] reversedCopy(int[] values) {
        int[] result = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            result[i] = values[values.length - 1 - i];
        }

        return result;
    }

    static int removeValue(int[] values, int target) {
        int count = 0;

        for (int i = 0; i < values.length; i++) {
            if (values[i] != target) {
                values[count] = values[i];
                count++;
            }
        }

        return count;
    }

    static int[] runningSum(int[] values) {
        int[] result = new int[values.length];
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum = sum + values[i];
            result[i] = sum;
        }

        return result;
    }
}
