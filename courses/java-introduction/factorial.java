import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        long fact = 1;
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}