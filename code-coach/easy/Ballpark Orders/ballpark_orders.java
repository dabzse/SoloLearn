import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] items = { "Nachos", "Pizza", "Cheeseburger", "Water", "Coke" };
        double[] prices = { 6.0, 6.0, 10.0, 4.0, 5.0 };

        double total = 0.0;
        String item;

        Scanner scanner = new Scanner(System.in);
        item = scanner.nextLine();

        String[] orders = item.split("\\s+");

        for (String order : orders) {
            int i;
            for (i = 0; i < items.length; i++) {
                if (order.equals(items[i])) {
                    total += prices[i];
                    break;
                }
            }

            if (i == items.length) {
                total += prices[prices.length - 1];
            }
        }

        System.out.printf("%.2f%n", total * 1.07);
    }
}
