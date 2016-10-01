package module06;

import java.util.Arrays;

public final class ArraysUtils {
    public static int sum(int[] array) {
        int toReturn = 0;
        for (int i : array) {
            toReturn += i;
        }
        return toReturn;
    }

    public static int min(int[] array) {
        int toReturn = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < toReturn) toReturn = array[i];
        }
        return toReturn;
    }

    public static int max(int[] array) {
        int toReturn = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > toReturn) toReturn = array[i];
        }
        return toReturn;
    }

    public static int maxPositive(int[] array) {
        int toReturn = array[0];
        for (int i = 1; i < array.length; i++) {
            if ((array[i] > 0) && (toReturn < array[i])) {
                toReturn = array[i];
            }
        }
        return toReturn;
    }

    public static long multiplication(int[] array) {
        long toReturn = 1;
        for (int i : array) {
            toReturn *= i;
        }
        return toReturn;
    }

    public static double multiplication(double[] array) {
        double toReturn = 1;
        for (double i : array) {
            toReturn *= i;
        }
        return toReturn;
    }

    public static int modulus(int[] array) {
        return array[0] % array[array.length - 1];
    }

    public static int secondLargest(int[] array) {
        int firstLargest = Integer.MIN_VALUE;
        int toReturn = Integer.MIN_VALUE;

        for (int i : array) {
            if (i > firstLargest) {
                toReturn = firstLargest;
                firstLargest = i;
            }
            if (toReturn < i && i < firstLargest) {
                toReturn = i;
            }
        }

        return toReturn;
    }

    private void swap(int[] array, int index1, int index2) {
        int tmpInt = array[index2];
        array[index2] = array[index1];
        array[index1] = tmpInt;
    }

    public int[] reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            swap(array, i, array.length - 1 - i);
        }
        return array;
    }

    public int[] findEvenElements(int[] array) {
        int[] result = new int[0];

        for (int value : array) {
            if (value % 2 == 0) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = value;
            }
        }

        return result;
    }

}
