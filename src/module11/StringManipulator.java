package module11;

import java.io.File;
import java.util.Map;

public class StringManipulator {
    private static final String string = "THE TRUTH IS OUT THERE";

    private File file;

    public StringManipulator(File file) {
        this.file = file;
    }

    public String replacer(Map<String, String> map) {
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
