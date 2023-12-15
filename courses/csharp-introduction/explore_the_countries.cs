// pro

using System;

public class Program
{
    public static void Main(string[] args)
    {
        int population = Convert.ToInt32(Console.ReadLine());
        int area = Convert.ToInt32(Console.ReadLine());
        // your code goes here
        if (population < 10_000 && area < 10_000)
        {
            Console.WriteLine("small country");
        }
    }
}