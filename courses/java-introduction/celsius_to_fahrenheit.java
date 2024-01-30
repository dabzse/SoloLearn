import java.util.Scanner;

public class Program {
    // your code goes here
    static double fahr(double c) {
        return 1.8 * c + 32;
    }
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();

        System.out.println(fahr(c));
    }
}