import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;

class Main {
/** The public type Main must be defined in its own file: Java(16777541)
 * it was:
 * public class Main {}
 * so I just removed the `public` and now shows no errors
*/
    public static void main(String[ ] args) {
/**
 * Resource leak: 'read' is never closed
 * Scanner read - Main.main(String[])
 * : quick fix :: surround with try-with-resources
*/
        try (Scanner scanner = new Scanner(System.in)) {
            LinkedList<Integer> nums = new LinkedList<Integer>();

            while (nums.size() < 5) {
                int num = scanner.nextInt();
                nums.add(num);
            }

            Iterator<Integer> it = nums.iterator();
            int sum = 0;
            while(it.hasNext())
            sum += it.next();
            System.out.println(sum);
        }
    }
}