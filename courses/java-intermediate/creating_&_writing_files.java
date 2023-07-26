import java.io.File;
import java.util.Scanner;
import java.util.Formatter;

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
        try (Scanner input = new Scanner(System.in)) {
            try {
                Formatter f = new Formatter("tasks.txt");
                int count = 0;
                while(count < 3) {
                    // your code goes here
                    String a = input.nextLine();
                    f.format(a + "\n");
                    count++;
                }
                f.close();
            }
            catch (Exception e) {
                System.out.println("Error");
            }
        }
        readFile();
    }

    public static void readFile() {
        try {
            File x = new File("tasks.txt");
            Scanner sc = new Scanner(x);
            while(sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        }
        catch (Exception e) {
            System.out.println("Error");
        }
    }
}

