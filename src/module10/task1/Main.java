package module10.task1;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("Inside try{} block");
            throw new Exception("New exception in Main tread.");
        } catch (Exception e) {
            System.out.println("Inside catch{} block");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Inside finally{} block");
        }
    }
}
