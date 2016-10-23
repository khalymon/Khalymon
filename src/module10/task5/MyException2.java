package module10.task5;

public class MyException2 extends NullPointerException {
    public MyException2() {
        System.out.println("MyException2 has been occurred.");
    }

    @Override
    public String toString() {
        return "MyException2{}";
    }
}
