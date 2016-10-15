package module07.task5;

import java.util.*;

public class Main {
    public static final int POW_3 = 1000;
    public static final int POW_5 = 100000;

    public static long doOperation(List list, String operation, int steps) {
        Calendar counterStart;
        Calendar counterFinish;
        long timeInMillis = -1;

        if (operation.charAt(0) == 'a') {
            counterStart = Calendar.getInstance();
            for (int i = 0; i < steps; i++) {
                list.add(i);
            }
            counterFinish = Calendar.getInstance();
            timeInMillis = counterFinish.getTimeInMillis() - counterStart.getTimeInMillis();
        }
        if (operation.charAt(0) == 's') {
            counterStart = Calendar.getInstance();
            for (int i = 0; i < steps; i++) {
                list.set(i, i);
            }
            counterFinish = Calendar.getInstance();
            timeInMillis = counterFinish.getTimeInMillis() - counterStart.getTimeInMillis();
        }
        if (operation.charAt(0) == 'g') {
            counterStart = Calendar.getInstance();
            for (int i = 0; i < steps; i++) {
                list.get(i);
            }
            counterFinish = Calendar.getInstance();
            timeInMillis = counterFinish.getTimeInMillis() - counterStart.getTimeInMillis();
        }
        if (operation.charAt(0) == 'r') {
            counterStart = Calendar.getInstance();
            for (int i = 0; i < steps; i++) {
                list.remove(0);
            }
            counterFinish = Calendar.getInstance();
            timeInMillis = counterFinish.getTimeInMillis() - counterStart.getTimeInMillis();
        }

        return timeInMillis;
    }

    public static void main(String[] args) {
        List<Integer> integerArrayListPow3 = new ArrayList<Integer>();
        List<Integer> integerArrayListPow5 = new ArrayList<Integer>();
        List<Integer> integerLinkedListPow3 = new LinkedList<Integer>();
        List<Integer> integerLinkedListPow5 = new LinkedList<Integer>();
        List<String> stringArrayListPow3 = new ArrayList<String>();
        List<String> stringArrayListPow5 = new ArrayList<String>();
        List<String> stringLinkedListPow3 = new LinkedList<String>();
        List<String> stringLinkedListPow5 = new LinkedList<String>();
        long timeInMillis;

        timeInMillis = doOperation(integerArrayListPow3, "add", POW_3);
        System.out.println("integerArrayListPow3.add() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(integerArrayListPow5, "add", POW_5);
        System.out.println("integerArrayListPow5.add() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(integerLinkedListPow3, "add", POW_3);
        System.out.println("integerLinkedListPow3.add() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(integerLinkedListPow5, "add", POW_5);
        System.out.println("integerLinkedListPow5.add() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(stringArrayListPow3, "add", POW_3);
        System.out.println("stringArrayListPow3.add() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(stringArrayListPow5, "add", POW_5);
        System.out.println("stringArrayListPow5.add() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(stringLinkedListPow3, "add", POW_3);
        System.out.println("stringLinkedListPow3.add() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(stringLinkedListPow5, "add", POW_5);
        System.out.println("stringLinkedListPow5.add() takes... " + timeInMillis + " ms");

        timeInMillis = doOperation(integerArrayListPow3, "set", POW_3);
        System.out.println("integerArrayListPow3.set() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(integerArrayListPow5, "set", POW_5);
        System.out.println("integerArrayListPow5.set() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(integerLinkedListPow3, "set", POW_3);
        System.out.println("integerLinkedListPow3.set() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(integerLinkedListPow5, "set", POW_5);
        System.out.println("integerLinkedListPow5.set() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(stringArrayListPow3, "set", POW_3);
        System.out.println("stringArrayListPow3.set() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(stringArrayListPow5, "set", POW_5);
        System.out.println("stringArrayListPow5.set() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(stringLinkedListPow3, "set", POW_3);
        System.out.println("stringLinkedListPow3.set() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(stringLinkedListPow5, "set", POW_5);
        System.out.println("stringLinkedListPow5.set() takes... " + timeInMillis + " ms");

        timeInMillis = doOperation(integerArrayListPow3, "get", POW_3);
        System.out.println("integerArrayListPow3.get() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(integerArrayListPow5, "get", POW_5);
        System.out.println("integerArrayListPow5.get() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(integerLinkedListPow3, "get", POW_3);
        System.out.println("integerLinkedListPow3.get() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(integerLinkedListPow5, "get", POW_5);
        System.out.println("integerLinkedListPow5.get() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(stringArrayListPow3, "get", POW_3);
        System.out.println("stringArrayListPow3.get() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(stringArrayListPow5, "get", POW_5);
        System.out.println("stringArrayListPow5.get() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(stringLinkedListPow3, "get", POW_3);
        System.out.println("stringLinkedListPow3.get() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(stringLinkedListPow5, "get", POW_5);
        System.out.println("stringLinkedListPow5.get() takes... " + timeInMillis + " ms");

        timeInMillis = doOperation(integerArrayListPow3, "remove", POW_3);
        System.out.println("integerArrayListPow3.remove() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(integerArrayListPow5, "remove", POW_5);
        System.out.println("integerArrayListPow5.remove() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(integerLinkedListPow3, "remove", POW_3);
        System.out.println("integerLinkedListPow3.remove() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(integerLinkedListPow5, "remove", POW_5);
        System.out.println("integerLinkedListPow5.remove() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(stringArrayListPow3, "remove", POW_3);
        System.out.println("stringArrayListPow3.remove() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(stringArrayListPow5, "remove", POW_5);
        System.out.println("stringArrayListPow5.remove() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(stringLinkedListPow3, "remove", POW_3);
        System.out.println("stringLinkedListPow3.remove() takes... " + timeInMillis + " ms");
        timeInMillis = doOperation(stringLinkedListPow5, "remove", POW_5);
        System.out.println("stringLinkedListPow5.remove() takes... " + timeInMillis + " ms");
    }
}
