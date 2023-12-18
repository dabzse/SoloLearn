// pro

using System;

public class Program
{
    public static void Main(string[] args)
    {
        int number = Convert.ToInt32(Console.ReadLine());

        // your code goes here
        while (number >= 0) {
            Console.WriteLine(number);
            number--;
        }
    }
}