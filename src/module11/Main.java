package module11;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
//        StringManipulator stringManipulator = new StringManipulator(new File("C:\\iofile.txt"));
        StringManipulator stringManipulator = new StringManipulator(new File("iofile.txt"));
        stringManipulator.replacer(map);
        System.out.println("Here.");
    }
}
