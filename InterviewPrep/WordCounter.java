package InterviewPrep;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input =sc.nextLine();

        int wordcount = countWords(input);
        int charcount = countCharacters(input);
        int tokenCount = countNumberOfTokens(input, 'o');
        System.out.println("No. of words: "+wordcount);
        System.out.println("No. of characters: "+charcount);
        System.out.println("No. of tokens: " + tokenCount);
        sc.close();
    }

    public static int countWords(String str) {
        StringTokenizer tokenizer = new StringTokenizer(str,"i");
        int count = tokenizer.countTokens();
        while(tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
        return count;
    }

    public static int countCharacters(String str) {
        char[] chars = str.toCharArray();
        return chars.length;
    }


    public static int countNumberOfTokens(String str, char delim) {
        char[] chars = str.toCharArray();
        int count=0;
        for(int i=0;i<chars.length;i++) {
            if(chars[i]==delim){
                count++;
            }

        }

        return count;

    }

}
