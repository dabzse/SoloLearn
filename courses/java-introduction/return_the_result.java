// pro

import java.util.Scanner;

class Demo {
    // add a return statement to the method to return the result
    static String isPrime(int number) {
        String result = "Is prime";
        for (int i = 2; i <= number / 2; ++i) {
            /**
             * condition for non prime number,
             * don't change condition
             */
            if (number % i == 0) {
                result = "Isn't prime";
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        String output = isPrime(number);
        System.out.println(output);
    }
}