// pro

import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            number = scanner.nextInt();
            /**
              *  output corresponding message
              *  1 => Language selection
              *  2 => Customer support
              *  3 => Check the balance
              *  0 => Exit
              */
            switch (number) {
                case 1:
                    System.out.println("Language selection");
                    break;
                case 2:
                    System.out.println("Customer support");
                    break;
                case 3:
                    System.out.println("Check the balance");
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
            }
        }
        while(number != 0);
    }
}