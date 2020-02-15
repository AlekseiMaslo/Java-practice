import java.util.*;
//  I did NOT create this myself. I create it by finding a parts in google and split it together...

public class Main {

    public static void main(String[] args) {
        // Create a method that will check if a given string is a palindrome.
        // If it is it should print “This string is a palindrome”
        // if not print “This string is not a palindrome”
        String inputString;
        System.out.println("Type your possible palindrome here");
        Scanner scanner = new Scanner(System.in);
        inputString = scanner.nextLine();

        String inputStringWithoutSpaces = inputString.replaceAll("\\s+", "");
        int length = inputStringWithoutSpaces.length();
        int a = 0;
        int b = length - 1;
        int c = (a + b)/2;
        int i;

        for (i = 0; i <= c; i++) {
            if (inputStringWithoutSpaces.charAt(a) == inputStringWithoutSpaces.charAt(b)) {
                a++;
                b--;
            }
            else
                break;
        }
        if (i == c + 1)
            System.out.println("This string is a palindrome");
        else
            System.out.println("This string is not a palindrome");
    }

}