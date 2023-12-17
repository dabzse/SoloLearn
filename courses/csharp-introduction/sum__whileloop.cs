using System;

public class Program
{
    static void Main(string[] args)
    {
        int num = Convert.ToInt32(Console.ReadLine());

        // your code goes here
        int sum = 0;
        int i = 1;
        while (i <= num)
        {
            sum += i;
            i++;
        }
        Console.WriteLine(sum);
    }
}