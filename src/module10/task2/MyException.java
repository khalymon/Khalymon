package module10.task2;

public class MyException extends Exception {
    private String exceptionMessage;

    public MyException(String message) {
        super(message);
        exceptionMessage = message;
    }
    public void print(){
        System.out.println(exceptionMessage);
    }
}
