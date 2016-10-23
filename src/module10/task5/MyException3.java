package module10.task5;

public class MyException3 extends ClassCastException {
    public MyException3() {
        System.out.println("MyException3 has been occurred.");
    }

    @Override
    public String toString() {
        return "MyException3{}";
    }
}
