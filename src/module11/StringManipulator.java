package module11;

import java.io.*;
import java.util.Map;

public class StringManipulator {
    private static final String STRING_REPLACE_WITH = "THE TRUTH IS OUT THERE";

    private File file;

    public StringManipulator(File file) {
        this.file = file;
    }

    /*
    * replacer works with 1st line only
    * other lines are ignored*
    *
    * */
    public String replacer(Map<String, String> map) {
        String StringReplaceTo = null;
        String stringResult;

        String[] wordsReplaceTo;
        String[] wordsReplaceWith;
        String[] wordsResult;

//        String[][] textReplaceTo;
//        String[][] textResult;

        int lengthDifference;

        //Charset charset = Charset.forName("UTF-8");

        try {
            InputStream inputStream = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line = null;
            if ((line = reader.readLine()) != null) {
                StringReplaceTo = line;
            }
//            while ((line = reader.readLine()) != null) {
//                StringReplaceTo += line;
//            }
            reader.close();
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

//        try {
//            OutputStream outputStream = new FileOutputStream(file);
//            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
//            writer.write(stringResult);
//            writer.close();
//        } catch (IOException ioe) {
//            System.out.println(ioe.getMessage());
//        }

        return stringResult;
    }

    /*
    * fileContentReplacer works with 1st line only
    * other lines are ignored*
    *
    * */
    public File fileContentReplacer(Map<String, String> map) {
        String StringReplaceTo = null;
        String stringResult;

        String[] wordsReplaceTo;
        String[] wordsReplaceWith;
        String[] wordsResult;

//        String[][] textReplaceTo;
//        String[][] textResult;

        int lengthDifference;

        //Charset charset = Charset.forName("UTF-8");

        try {
            InputStream inputStream = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line = null;
            if ((line = reader.readLine()) != null) {
                StringReplaceTo = line;
            }
//            while ((line = reader.readLine()) != null) {
//                StringReplaceTo += line;
//            }
            reader.close();
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
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
            writer.write(stringResult);
            writer.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        return file;
    }

    /*
    * fileContentMerger looking for a words from 1st line only
    * other lines are ignored*
    *
    * */
    public File fileContentMerger(Map<String, String> map) {
        String StringReplaceTo = null;
        String stringResult;

        String[] wordsReplaceTo;
        String[] wordsReplaceWith;
        String[] wordsResult;

//        String[][] textReplaceTo;
//        String[][] textResult;

        int lengthDifference;

        //Charset charset = Charset.forName("UTF-8");

        try {
            InputStream inputStream = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line = null;
            if ((line = reader.readLine()) != null) {
                StringReplaceTo = line;
            }
//            while ((line = reader.readLine()) != null) {
//                StringReplaceTo += line;
//            }
            reader.close();
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
            OutputStream outputStream = new FileOutputStream(file, true);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
            writer.write("\n");
            writer.write(stringResult);
            writer.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        return file;
    }

    int checkWord(String word) {

        int resultCounter = 0;
        String StringReplaceTo = null;
        String[] wordsReplaceTo;

        try {
            InputStream inputStream = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line = null;
            if ((line = reader.readLine()) != null) {
                StringReplaceTo = line;
            }
            reader.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        if (StringReplaceTo == null) {
            return 0;
        }
        wordsReplaceTo = StringReplaceTo.split(" ");

        if (wordsReplaceTo == null) {
            return 0;
        }

        for (int i = 0; i < wordsReplaceTo.length; i++) {
            if (wordsReplaceTo[i].equalsIgnoreCase(word)) {
                resultCounter++;
            }
        }

        return resultCounter;
    }
}
