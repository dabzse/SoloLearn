// pro

using System;

public class Program
{
    public static void Main(string[] args)
    {
        int hour = Convert.ToInt32(Console.ReadLine());
        // your code goes here
        if (hour >= 19) {
            Console.WriteLine("Lights On");
        }
    }
}