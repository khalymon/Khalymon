package module11;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class StringManipulator {
    private static final String STRING_REPLACE_WITH = "THE TRUTH IS OUT THERE";

    private File file;

    public StringManipulator(File file) {
        this.file = file;
    }

    public String replacer(Map<String, String> map) {
        String stringResult;
        String[] wordsResult = null;
        String StringReplaceTo = null;
        String[] wordsReplaceTo;
        String[] wordsReplaceWith;
        int lengthDifference;

        try {
            InputStream inputStream = new FileInputStream(file);
            StringReplaceTo = inputStream.toString();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        if (StringReplaceTo == null) {
            return null;
        } else {
            wordsReplaceTo = StringReplaceTo.split(" ");
        }
        wordsReplaceWith = STRING_REPLACE_WITH.split(" ");

        lengthDifference = wordsReplaceTo.length - wordsReplaceWith.length;

        if (lengthDifference == 0) {
            wordsResult = wordsReplaceWith;
        }
        if (lengthDifference < 0) {

        } else {

        }


        if (wordsResult == null) {
            return null;
        }
        stringResult = wordsResult[0];
        for (int i = 1; i < wordsResult.length; i++) {
            stringResult += (" " + wordsResult[i]);
        }

        return stringResult;
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
