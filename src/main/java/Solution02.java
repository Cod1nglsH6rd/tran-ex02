import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args){
        /*
         Print "What is the input string?"
            Input = word
            Compute number of charater = stringNum
         Print "word" and "stringnum"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("What is the input string?");
        String word = input.nextLine();
        int stringNum = word.length();
        System.out.printf("%s had %d characters.", word, stringNum);
    }
}
