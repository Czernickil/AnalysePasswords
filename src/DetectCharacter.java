import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class DetectCharacter{
    public int[] getSpecialCharacterCount(String s,int arr[]) throws IOException {
        if (s == null || s.trim().isEmpty()) {
            //System.out.println("Incorrect format of string");
            return arr;
        }


        Pattern patternSpecialCharacters = Pattern.compile("[^A-Za-z0-9]");
        Matcher matcherSpecialCharacters = patternSpecialCharacters.matcher(s);

        Pattern patternSmallLetters = Pattern.compile("[a-z]");
        Matcher matcherSmallLetters = patternSmallLetters.matcher(s);

        Pattern patternLargeLetters = Pattern.compile("[A-Z]");
        Matcher matcherLargeLetters = patternLargeLetters.matcher(s);

        Pattern patternNumbers = Pattern.compile("[0-9]");
        Matcher matcherNumbers = patternNumbers.matcher(s);


        boolean c = matcherSpecialCharacters.find();

        if (c)
            arr[0]++;


        boolean d = matcherSmallLetters.find();
        if (d)
            arr[1]++;


        boolean e = matcherLargeLetters.find();
        if (e)
            arr[2]++;


        boolean f = matcherNumbers.find();
        if (f)
            arr[3]++;


        int passwordLength = s.length();
        if(passwordLength<20) {
            if(passwordLength==6){
                arr[2020]++;
            }
            arr[30 + passwordLength]++;
        }else
            arr[50]++;
        if (f && (c || d || e)) {
            char ch = ' ';
            int count=0;
            boolean checkpoint1 = false;
            boolean checkpoint2 = false;
            boolean checkpoint3 = false;
            for (int i = 0; i < passwordLength; i++) {
                ch = s.charAt(i);
                if (Character.isDigit(ch)) {
                    checkpoint1 = true;
                    count++;
                    if (checkpoint2) {
                        checkpoint3 = true;
                    }
                }
                if (!Character.isDigit(ch)) {
                    if (checkpoint1) {
                        checkpoint2 = true;
                    }
                }

            }
            if (!checkpoint3) {

                if (Character.isDigit(s.charAt(0))){
                    if(count<6){
                        arr[60+count]++;}
                    else{
                        arr[66]++;
                    }
                    arr[4]++;
                }

                if (Character.isDigit(s.charAt(s.length() - 1)))
                {
                    if(count<6){
                        arr[70+count]++;}
                    else{
                        arr[76]++;
                    }
                    arr[5]++;
                }

            }
        }
        if (c && (f || d || e)) {
            char ch = ' ';
            boolean checkpoint1 = false;
            boolean checkpoint2 = false;
            boolean checkpoint3 = false;
            int count=0;
            for (int i = 0; i < passwordLength; i++) {
                ch = s.charAt(i);
                if (!Character.isLetterOrDigit(ch)) {
                    count++;
                    checkpoint1 = true;
                    if (checkpoint2) {
                        checkpoint3 = true;
                    }
                }
                if (Character.isLetterOrDigit(ch)) {
                    if (checkpoint1) {
                        checkpoint2 = true;
                    }
                }

            }
            if (!checkpoint3) {
                //System.out.println(s + " not ends with a numbers or starts");
                if (!Character.isLetterOrDigit(s.charAt(0)))
                {
                    if(count<6){
                        arr[80+count]++;}
                    else{
                        arr[86]++;
                    }
                    arr[22]++;
                }
                if (!Character.isLetterOrDigit(s.charAt(s.length() - 1)))
                {
                    if(count<6){
                        arr[90+count]++;}
                    else{
                        arr[96]++;
                    }
                    arr[23]++;
                }

            }
        }
        if (c && d && e && f) {
            arr[6]++;
            Files.writeString(
                    Path.of("SortedPasswords//abC1//"+passwordLength+".txt"),
                    s + System.lineSeparator(),
                    CREATE, APPEND
            );
        }
        if (!c && d && e && f) {
            arr[7]++;
            Files.writeString(
                    Path.of("SortedPasswords//bC1//"+passwordLength+".txt"),
                    s + System.lineSeparator(),
                    CREATE, APPEND
            );
        }
        if (c && !d && e && f) {
            arr[8]++;
            Files.writeString(
                    Path.of("SortedPasswords//aC1//"+passwordLength+".txt"),
                    s + System.lineSeparator(),
                    CREATE, APPEND
            );
        }
        if (!c && !d && e && f) {
            arr[9]++;
            Files.writeString(
                    Path.of("SortedPasswords//C1//"+passwordLength+".txt"),
                    s + System.lineSeparator(),
                    CREATE, APPEND
            );
        }
        if (c && d && !e && f) {
            arr[10]++;
            Files.writeString(
                    Path.of("SortedPasswords//ab1//"+passwordLength+".txt"),
                    s + System.lineSeparator(),
                    CREATE, APPEND
            );
        }
        if (!c && d && !e && f) {
            arr[11]++;
            Files.writeString(
                    Path.of("SortedPasswords//b1//"+passwordLength+".txt"),
                    s + System.lineSeparator(),
                    CREATE, APPEND
            );
        }
        if (c && !d && !e && f) {
            arr[12]++;
            Files.writeString(
                    Path.of("SortedPasswords//a1//"+passwordLength+".txt"),
                    s + System.lineSeparator(),
                    CREATE, APPEND
            );
        }
        if (!c && !d && !e && f) {
            arr[13]++;
            Files.writeString(
                    Path.of("SortedPasswords//1//"+passwordLength+".txt"),
                    s + System.lineSeparator(),
                    CREATE, APPEND
            );
        }
        if (c && d && e && !f) {
            arr[14]++;
            Files.writeString(
                    Path.of("SortedPasswords//abC//"+passwordLength+".txt"),
                    s + System.lineSeparator(),
                    CREATE, APPEND
            );
        }
        if (!c && d && e && !f) {
            arr[15]++;
            Files.writeString(
                    Path.of("SortedPasswords//bC//"+passwordLength+".txt"),
                    s + System.lineSeparator(),
                    CREATE, APPEND
            );
        }
        if (c && !d && e && !f) {
            arr[16]++;
            Files.writeString(
                    Path.of("SortedPasswords//aC//"+passwordLength+".txt"),
                    s + System.lineSeparator(),
                    CREATE, APPEND
            );
        }
        if (!c && !d && e && !f) {
            arr[17]++;
            Files.writeString(
                    Path.of("SortedPasswords//C//"+passwordLength+".txt"),
                    s + System.lineSeparator(),
                    CREATE, APPEND
            );
        }
        if (c && d && !e && !f) {
            arr[18]++;
            Files.writeString(
                    Path.of("SortedPasswords//ab//"+passwordLength+".txt"),
                    s + System.lineSeparator(),
                    CREATE, APPEND
            );
        }
        if (!c && d && !e && !f) {
            arr[19]++;
            Files.writeString(
                    Path.of("SortedPasswords//b//"+passwordLength+".txt"),
                    s + System.lineSeparator(),
                    CREATE, APPEND
            );
        }
        if (c && !d && !e && !f) {
            arr[20]++;
            Files.writeString(
                    Path.of("SortedPasswords//a//"+passwordLength+".txt"),
                    s + System.lineSeparator(),
                    CREATE, APPEND
            );
        }
        if (!c && !d && !e && !f) {
            arr[21]++;
            Files.writeString(
                    Path.of("SortedPasswords//b//"+passwordLength+".txt"),
                    s + System.lineSeparator(),
                    CREATE, APPEND
            );
        }

        arr[29]++;
        return arr;
    }


}