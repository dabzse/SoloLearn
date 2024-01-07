// pro

import java.util.Scanner;

class Demo
{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int students = myObj.nextInt();
        int pencils = myObj.nextInt();

        // your code goes here
        System.out.println(pencils * students);
    }
}