// pro

using System;

public class Program
{
    public static void Main(string[] args)
    {
        int number = Convert.ToInt32(Console.ReadLine());

        // your code goes here
        for (int i = 1; i <= number; i += 2) {
            Console.Write(i + " ");
        }
    }
}