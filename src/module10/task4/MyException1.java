package module10.task4;

public class MyException1 extends Exception {
    public MyException1() {
        System.out.println("MyException1 has been occurred.");
    }

    @Override
    public String toString() {
        return "MyException1{}";
    }
}
