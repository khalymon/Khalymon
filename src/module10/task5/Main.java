package module10.task5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int exceptionCaseGenerator = new Random().nextInt(3);
        try {
            switch (exceptionCaseGenerator) {
                case 0:
                    throw new MyException1();
                    //break;
                case 1:
                    throw new MyException2();
                    //break;
                case 2:
                    throw new MyException3();
                    //break;
                default:
                    System.out.println("WARNING! This message shouldn't appear.");
                    break;
            }
        } catch (MyException1 | MyException2 | MyException3 e) {
            System.out.println("Exception " + e.toString() + " had been handled.");
        }
    }
}
