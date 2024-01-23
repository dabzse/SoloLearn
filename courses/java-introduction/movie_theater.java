import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int[][] seats = {
            {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
            {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
            {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        Scanner sc = new Scanner(System.in);
        // your code goes here
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println(seats[row][col] == 1 ? "Sold" : "Free");
    }
}