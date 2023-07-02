import java.util.Scanner;

class Main {

    public static void main(String[] args) {

/**
 * Resource leak: 'read' is never closed
 * Scanner read - Main.main(String[])
 * : quick fix :: surround with try-with-resources
 */

        try (Scanner read = new Scanner(System.in)) {
            int num1 = read.nextInt();
            int num2 = read.nextInt();

            // your code goes here
            System.out.println(Math.pow(num1, num2));
        }
    }
}