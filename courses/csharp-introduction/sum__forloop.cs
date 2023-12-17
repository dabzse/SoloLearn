using System;

public class Program
{
    static void Main(string[] args)
    {
        int num = Convert.ToInt32(Console.ReadLine());

        // your code goes here
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        Console.WriteLine(sum);
    }
}