package module11;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class StringManipulator {
    private static final String replaceWith = "THE TRUTH IS OUT THERE";

    private File file;

    public StringManipulator(File file) {
        this.file = file;
    }

    public String replacer(Map<String, String> map) {
        String key = null;
        Charset charset = Charset.forName("UTF-8");

        try {
            InputStream inputStream = new FileInputStream(file);
            key = inputStream.toString();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        System.out.println(replaceWith);
        map = new HashMap<>();
        map.put(key, replaceWith);
        return null;
    }

    public File fileContentReplacer(Map<String, String> map) {
        return file;
    }

    public File fileContentMerger(Map<String, String> map) {
        return file;
    }

    int checkWord(String word) {
        return 0;
    }
}
