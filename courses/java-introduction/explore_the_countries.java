// pro

import java.util.Scanner;

class Demo {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int population = read.nextInt();
        int area = read.nextInt();
        // Complete the code
        if (population < 10_000 && area < 10_000) {
            System.out.println("small country");
        }
    }
}