import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int width = read.nextInt();
        int height = read.nextInt();
        printArea(width, height);
    }

    // complete the bottom method
    public static void printArea(int width, int height) {
        System.out.println(width * height);
    }
}