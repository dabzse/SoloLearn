import java.util.Scanner;
import java.util.InputMismatchException;

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
        try (Scanner scanner = new Scanner(System.in)) {
            try {
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                System.out.println(num1 / num2);
                /**
                  * 1. Error: division by zero
                  * 2. Error: wrong value type
                  */
                // your code goes here
            }
            catch (ArithmeticException e) {
                System.out.println("Error: division by zero");
            }
            catch(InputMismatchException e) {
                System.out.println("Error: wrong value type");
            }
        }
    }
}