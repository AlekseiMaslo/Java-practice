import java.util.Arrays;

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
    }
}