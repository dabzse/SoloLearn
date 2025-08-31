import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // your code goes here
        Scanner boil = new Scanner(System.in);
        int temp = boil.nextInt();
        if(temp >= 100) {
            System.out.println("Boiling");
        }
        else {
            System.out.println("Not boiling");
        }
    }
}