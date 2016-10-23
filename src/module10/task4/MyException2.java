package module10.task4;

public class MyException2 extends Exception{
    public MyException2() {
        System.out.println("MyException2 has been occurred.");
    }

    @Override
    public String toString() {
        return "MyException2{}";
    }
}
