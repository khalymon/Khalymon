package module10.task5;

public class MyException1 extends IndexOutOfBoundsException {
    public MyException1() {
        System.out.println("MyException1 has been occurred.");
    }

    @Override
    public String toString() {
        return "MyException1{}";
    }
}
