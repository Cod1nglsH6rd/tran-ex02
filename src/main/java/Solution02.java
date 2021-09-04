import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args){
        /*
         Create a program that prompts for an input string and displays output that shows the input string and the number of characters the string contains.
         Ask for any word
            Read input = word
            Compute number of charater = stringNum
         Print both "word" and "stringnum"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("What is the input string?");
        String word = input.nextLine();
        int stringNum = word.length();
        System.out.printf("%s had %d characters.", word, stringNum);
    }
}
