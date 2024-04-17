import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sales = Integer.parseInt(scanner.nextLine());
        int invest = 10 * 2000_000 + 1000_000;
        long monthly = (long) sales * 3000_000;

        if (monthly < invest)
            System.out.println("Loss");
        else if (monthly == invest)
            System.out.println("Broke Even");
        else
            System.out.println("Profit");

        scanner.close();
    }
}