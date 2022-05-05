package problemsAndSolutions;

import java.util.Scanner;

public class Word_Count_Practice {

    public static void main(String[] args) {
        Word_Count_Practice.getWordcount();

    }
    public static void getWordcount(){

        String str= "i am learning word counting";
        int count=1;
        for (int i=0; i<str.length();i++) {
            if ((str.charAt(i) == ' ') && (str.charAt(i - 1) != ' ')) {
                count++;
            }

        }
            System.out.println("total word count " +count);

    }


}
