import java.util.ArrayList;
import java.util.Scanner;

class Main {
/** The public type Main must be defined in its own file: Java(16777541)
 * it was:
 * public class Main {}
 * so I just removed the `public` and now shows no errors
*/
    public static void main(String[] args) {
/**
 * Resource leak: 'read' is never closed
 * Scanner read - Main.main(String[])
 * : quick fix :: surround with try-with-resources
 */
        try(Scanner scanner = new Scanner(System.in)) {
            ArrayList<Integer> evennums = new ArrayList<Integer>();

            int sum = 0;
            while (evennums.size() < 3) {
                int num = scanner.nextInt();
                // your code goes here
                evennums.add(num);
                sum += num;
            }

            // calculate and output the average integer value
            System.out.println(sum / 3);
        };
    }
}