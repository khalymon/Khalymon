package module10.task1;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println("Here.");
            throw new Exception("New exception in Main tread.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}
