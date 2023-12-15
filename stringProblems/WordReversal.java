package stringProblems;

import java.util.Scanner;

public class WordReversal {
    public static void main(String[] args){

        Scanner scannerObject = new Scanner(System.in);
        System.out.print("enter a sentence: ");
        String word = scannerObject.nextLine();
        String[] words = word.split(" ");
        String reversedWords="";

        for(int i = words.length-1;i>=0;i--){
            String firstChar = words[i].substring(0,1).toUpperCase();
            words[i] = firstChar + words[i].substring(1,words[i].length());
            reversedWords+=words[i] + " ";
        }

        System.out.println(reversedWords);


    }
}