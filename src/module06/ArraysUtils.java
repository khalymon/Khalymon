package module06;

public class ArraysUtils {
    public static int sum(int[] array) {
        int toReturn = 0;
        for (int i : array) {
            toReturn += i;
        }
        return toReturn;
    }

    public static double sum(double[] array) {
        double toReturn = 0;
        for (double i : array) {
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

    public static double min(double[] array) {
        double toReturn = array[0];
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

    public static double max(double[] array) {
        double toReturn = array[0];
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

    public static double maxPositive(double[] array) {
        double toReturn = array[0];
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

    public static double modulus(double[] array) {
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
            if ((toReturn < i) && (i < firstLargest)) {
                toReturn = i;
            }
        }

        return toReturn;
    }

    public static double secondLargest(double[] array) {
        double firstLargest = -Double.MAX_VALUE;
        double toReturn = -Double.MAX_VALUE;

        for (double i : array) {
            if (i > firstLargest) {
                toReturn = firstLargest;
                firstLargest = i;
            }
            if ((toReturn < i) && (i < firstLargest)) {
                toReturn = i;
            }
        }
        return toReturn;
    }

    public int[] reverse(int[] array) {
        int[] toReturn = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            toReturn[i] = array[array.length - 1 - i];
        }
        return toReturn;
    }

    public int[] findEvenPlacedElements(int[] array) {
        int[] toReturn = new int[(array.length + 1) / 2];
        for (int i = 0; i < array.length; i += 2) {
            toReturn[i / 2] = array[i];
        }
        return toReturn;
    }

    public int[] findEvenElements(int[] array) {
        int evenCounter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCounter++;
            }
        }
        int[] toReturn = new int[evenCounter];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                toReturn[toReturn.length - evenCounter] = array[i];
                evenCounter--;
            }
        }

        return toReturn;
    }
}
