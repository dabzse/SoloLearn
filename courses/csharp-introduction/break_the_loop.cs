using System;

public class Program
{
    static void Main(string[] args)
    {
        int result = 1;

        for(int i = 1; i <= 100; i++)
        {
            // your code goes here
            if (result > 10_000) {
                break;
            }
            result *= i;
        }
        Console.WriteLine(result);
    }
}