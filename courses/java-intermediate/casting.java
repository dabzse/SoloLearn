import java.util.Scanner;

class Main {
    public static void main(String[] args) {
/**
 * Resource leak: 'read' is never closed
 * Scanner read - Main.main(String[])
 * : quick fix :: surround with try-with-resources
 */
        try (Scanner read = new Scanner(System.in)) {
            char a = read.next().charAt(0);

            // your code goes here
            int b = (int) a;
            System.out.println(b);
        }
    }
}