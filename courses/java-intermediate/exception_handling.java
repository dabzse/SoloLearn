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
        try (Scanner scanner = new Scanner(System.in)) {
                int choice = scanner.nextInt();
                String[] categories = {"PCs", "Notebooks", "Tablets", "Phones", "Accessories"};

                // complete the code
                try {
                    System.out.println(categories[choice]);
                }
                catch(Exception e) {
                    System.out.println("Wrong Option");
                }
        }
    }
}