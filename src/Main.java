import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       //Create a loop that will print numbers from 1 to 10, except number 7
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                i++;
            }
            System.out.println(i);
        }
        System.out.println("New task");
        //Create An Array of integers from 1 to 5, Call an integer on array using index and print it.
        int [] a = {1, 2, 3, 4, 5};
        System.out.println(a[1]);

        System.out.println("New task");
        //Call index outside of the bound. Handle this exception printing “Outside of bound message.”
        try {
            System.out.println(a[100]);
        } catch (Exception e) {
            System.out.println("Outside of bound message");
        }

        //You need to create a program, which will accept a string
        // and check if total count on characters within the string is even it should return:
        //“String is even” If not it should return: “String is not even”
        System.out.println("Type your word here");
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int i = type.length();

        if (i % 2 == 0) {
            System.out.println("String is even");
        } else {
            System.out.println("String is not even");
        }
    }
}