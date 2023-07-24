import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main {
/** The public type Main must be defined in its own file: Java(16777541)
 * it was:
 * public class Main {}
 * so I just removed the `public` and now shows no errors
*/
    public static void main(String[ ] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
/**
 * Resource leak: 'read' is never closed
 * Scanner read - Main.main(String[])
 * : quick fix :: surround with try-with-resources
*/

        try (Scanner scanner = new Scanner(System.in)) {
            while (nums.size() < 5) {
                int num = scanner.nextInt();
                // your code goes here
                nums.add(num);
            }
        }

        // your code goes here
        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));
    }
}