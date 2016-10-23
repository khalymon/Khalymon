package module10.task4;

public class Main {
    public static void main(String[] args) {
        FG_Class fg_class = new FG_Class();
        try {
            System.out.println("Invoking g() method.");
            fg_class.g();
        } catch (MyException1 me1) {
            System.out.println("Exception " + me1.toString() + " had been handled.");
        }
        System.out.println("=========");
        try {
            System.out.println("Invoking f() method.");
            fg_class.f();
        }
        catch (MyException2 me2){
            System.out.println("Exception " + me2.toString() + " had been handled.");
        }
    }
}
