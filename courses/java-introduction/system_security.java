// pro

import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        int[] passwords = {2021, 1023, 9929};
        Scanner scanner = new Scanner(System.in);

        int  password = scanner.nextInt();
        /**
         * iterate through the array “passwords” and
         * compare  items with inputted password.
         */
        for(int i: passwords) {
            if(i == password) {
                System.out.println("Welcome");
                return;
            }
        }
    }
}