// pro

import java.util.Scanner;

class Demo{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        // complete the code
        if(price <= 12_000) {
            System.out.println( "enough");
        }
    }
}