import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // your code goes here
        Scanner numTo = new Scanner(System.in);
        int num = numTo.nextInt();
        int result = 0;
        for(int i = 1; i <= num; i++) {
            result += i;
        }
        System.out.println(result);
    }
}