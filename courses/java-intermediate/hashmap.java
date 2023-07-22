import java.util.HashMap;
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
            HashMap<String, Integer> ages = new HashMap<String, Integer>();
            ages.put("David", 22);
            ages.put("Tom", 23);
            ages.put("Robert", 32);
            ages.put("Alice", 21);
            ages.put("Sophie", 19);
            ages.put("Maria", 24);
            ages.put("John", 28);

            String[] nameArr = new String[ages.size()];
            nameArr = ages.keySet().toArray(nameArr);

            int ageLimit = scanner.nextInt();

            for (String emp : nameArr) {
                // your code goes here
                if(ages.get(emp)< ageLimit) {
                    ages.remove(emp);
                }
            }

            System.out.println(ages);
        }
    }
}