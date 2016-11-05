package module11;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        String word = "the";
        StringManipulator stringManipulator = new StringManipulator(new File("src\\module11\\iofile.txt"));
        /*1*/   //   System.out.println(stringManipulator.replacer(map));
        /*2*/   //   stringManipulator.fileContentReplacer(map);
        /*3*/   //   stringManipulator.fileContentMerger(map);
        /*4*/

        System.out.print("The word \"" + word + "\" " + "has ");
        System.out.print(stringManipulator.checkWord(word));
        System.out.println(" encounters.");

        //  System.out.println("Here.");
    }
}
