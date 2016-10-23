package module10.task2;

public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try{} block");
            throw new MyException("New exception has been occurred.");
        }
        catch (MyException e){
            System.out.println("Inside catch{} block");
            e.print();
        }
    }
}
