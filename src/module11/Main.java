package module11;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        StringManipulator stringManipulator = new StringManipulator(new File("src\\module11\\iofile.txt"));
        //   System.out.println(stringManipulator.replacer(map));
        //   stringManipulator.fileContentReplacer(map);
        stringManipulator.fileContentMerger(map);
        System.out.println("Here.");
    }
}
