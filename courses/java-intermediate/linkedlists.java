import java.util.LinkedList;
import java.util.Scanner;

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
            LinkedList<String> words = new LinkedList<String>();

            while (words.size() < 5) {
                String word = scanner.nextLine();
                // add the word to LinkedList
                words.add(word);
            }

            // your code goes here
            for(String w : words) {
                if (w.length()>4) {
                    System.out.println(w);
                }
            }
        }
    }
}