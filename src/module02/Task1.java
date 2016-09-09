package module02;

public class Task1 {
    static int sum(int[] array) {
        int toReturn = 0;
        for (int i : array) {
            toReturn += i;
        }
        return toReturn;
    }

    static double sum(double[] array) {
        double toReturn = 0;
        for (double i : array) {
            toReturn += i;
        }
        return toReturn;
    }

    static int min(int[] array) {
        int toReturn = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < toReturn) toReturn = array[i];
        }
        return toReturn;
    }

    static double min(double[] array) {
        double toReturn = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < toReturn) toReturn = array[i];
        }
        return toReturn;
    }

    static int max(int[] array) {
        int toReturn = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > toReturn) toReturn = array[i];
        }
        return toReturn;
    }

    static double max(double[] array) {
        double toReturn = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > toReturn) toReturn = array[i];
        }
        return toReturn;
    }

    static int maxPositive(int[] array) {
        int toReturn = array[0];
        for (int i = 1; i < array.length; i++) {
            if ((array[i] > 0) && (toReturn < array[i])) {
                toReturn = array[i];
            }
        }
        return toReturn;
    }

    static double maxPositive(double[] array) {
        double toReturn = array[0];
        for (int i = 1; i < array.length; i++) {
            if ((array[i] > 0) && (toReturn < array[i])) {
                toReturn = array[i];
            }
        }
        return toReturn;
    }

    static long multiplication(int[] array) {
        long toReturn = 1;
        for (int i : array) {
            toReturn *= i;
        }
        return toReturn;
    }

    static double multiplication(double[] array) {
        double toReturn = 1;
        for (double i : array) {
            toReturn *= i;
        }
        return toReturn;
    }

    static int modulus(int[] array) {
        return array[0] % array[array.length - 1];
    }

    static double modulus(double[] array) {
        return array[0] % array[array.length - 1];
    }

    /*
    Очень хорошее решение за один проход массива,
    большинство решило эту задачу с использованием
    уже реализованной ранее функции max(int[] array)
    Повторюсь, твое решение лучше потому что заботает за один проход!

    есть замечание только к именованию переменных, в данном случае
    внутренней переменной массива "i", я бы назвал её или value или item
    toReturn назвалбы или result или secondLargest

    во втором уловии не нужно явно расставлять скобки у операции < больше приоритет
    чем у &&, это как с *, / и +, -
     */
    static int secondLargest(int[] array) {
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
/*
        int firstLargest = max(array);
        int toReturn = Integer.MIN_VALUE;

        for (int i : array) {
            if (toReturn < i && i < firstLargest) {
                toReturn = i;
            }
        }
*/
        return toReturn;
    }

    static double secondLargest(double[] array) {
        double firstLargest = Double.MIN_VALUE;
        double toReturn = Double.MIN_VALUE;

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

    public static void main(String[] args) {
        int[] arrayInt = {10, -5, -1, 10, 9, 9, 10, 10, 9, 7};
        double[] arrayDouble = {10, -5, -1, 10, 9, 9, 10, 10, 9, 7};

        System.out.println("sum: " + sum(arrayInt));
        System.out.println("sum: " + sum(arrayDouble));
        System.out.println("min: " + min(arrayInt));
        System.out.println("min: " + min(arrayDouble));
        System.out.println("max: " + max(arrayInt));
        System.out.println("max: " + max(arrayDouble));
        System.out.println("maxPositive: " + maxPositive(arrayInt));
        System.out.println("maxPositive: " + maxPositive(arrayDouble));
        System.out.println("multiplication: " + multiplication(arrayInt));
        System.out.println("multiplication: " + multiplication(arrayDouble));
        System.out.println("modulus: " + modulus(arrayInt));
        System.out.println("modulus: " + modulus(arrayDouble));
        System.out.println("secondLargest: " + secondLargest(arrayInt));
        System.out.println("secondLargest: " + secondLargest(arrayDouble));
    }
}
