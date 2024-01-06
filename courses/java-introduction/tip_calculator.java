import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // your code goes here
        Scanner scanner = new Scanner(System.in);
        double bill = scanner.nextDouble();
        System.out.println(bill * 15 / 100);
    }
}