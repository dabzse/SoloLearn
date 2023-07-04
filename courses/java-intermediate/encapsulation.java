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

        try (Scanner read = new Scanner(System.in)) {
            int a = read.nextInt();

            Pupil pupil = new Pupil();
            pupil.setAge(a);
        }
    }
}

class Pupil {
    private int age;

    // complete setter method
    public void setAge(int a) {
        System.out.println(a > 6 ? "Welcome" : "Sorry");
    }

    public int getAge() {
        return age;
    }
}

/**
 * OR use the following code

class Pupil {
    private int age;

    // complete setter method
    public void setAge(int a) {
        if (a > 6) {
            age = a;
            System.out.println("Welcome");
        }
        else {
            System.out.println("Sorry");
        }
    }
    public int getAge() {
        return age;
    }
}

 */