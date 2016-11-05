package module11;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Map;

public class StringManipulator {
    private static final String STRING_REPLACE_WITH = "THE TRUTH IS OUT THERE";

    private File file;

    public StringManipulator(File file) {
        this.file = file;
    }

    public String replacer(Map<String, String> map) {
        String stringResult;
        String[] wordsResult;
        String StringReplaceTo = null;
        String[] wordsReplaceTo;
        String[] wordsReplaceWith;
        int lengthDifference;

        Charset charset = Charset.forName("UTF-8");

        try {
            InputStream inputStream = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line = null;
            while ((line = reader.readLine()) != null) {
                StringReplaceTo += line;
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        if (StringReplaceTo == null) {
            return null;
        }
        wordsReplaceTo = StringReplaceTo.split(" ");
        wordsReplaceWith = STRING_REPLACE_WITH.split(" ");
        lengthDifference = wordsReplaceTo.length - wordsReplaceWith.length;

        if (lengthDifference == 0) {
            wordsResult = wordsReplaceWith;
        }
        if (lengthDifference > 0) {
            wordsResult = wordsReplaceTo;
            for (int i = 0; i < wordsReplaceWith.length; i++) {
                wordsResult[i] = wordsReplaceWith[i];
            }
        } else {
            wordsResult = wordsReplaceTo;
            for (int i = 0; i < wordsReplaceTo.length; i++) {
                wordsResult[i] = wordsReplaceWith[i];
            }
        }

        if (wordsResult == null) {
            return null;
        }
        stringResult = wordsResult[0];
        for (int i = 1; i < wordsResult.length; i++) {
            stringResult += (" " + wordsResult[i]);
        }

        try {
            OutputStream outputStream = new FileOutputStream(file);
            outputStream.write();
            //   StringReplaceTo = inputStream.toString();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
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
