import java.util.Scanner;

public class Program {
    // your code goes here
    static void convert(double num) {
        double inches = num * 12;
        System.out.println(inches);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        convert(num);
    }
}