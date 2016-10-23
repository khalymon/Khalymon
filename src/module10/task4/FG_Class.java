package module10.task4;

public class FG_Class {
    public void f() throws MyException2 {
        System.out.println("Inside method f()");
        try {
            g();
        } catch (MyException1 me1) {
            System.out.println("Exception " + me1.toString() + " had been caught.");
            System.out.println("Throwing different exception.");
            throw new MyException2();
        }
    }

    public void g() throws MyException1 {
        System.out.println("Inside method g()");
        throw new MyException1();
    }
}
