import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String [] args) throws FileNotFoundException {
        new Main().findLongestWords();
    }

    public String findLongestWords() throws FileNotFoundException {

        String longest_word ="  ";
        String string1;
        Scanner sc = new Scanner(new File("abc.txt"));


        while (sc.hasNext()) {
            string1 = sc.next();
            if (string1.length() > longest_word.length()) {
                longest_word = string1;
            }

        }
        System.out.println("\n"+longest_word+"\n");
        return longest_word;
    }
}
