import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String[] menu = { "Tea", "Espresso", "Americano", "Water", "Hot Chocolate" };
        Scanner sc = new Scanner(System.in);
        // your code goes here
        int choice = sc.nextInt();
        if (choice >= 0 && choice < menu.length) {
            System.out.println(menu[choice]);
        }
        else {
            System.out.println("Invalid");
        }
    }
}