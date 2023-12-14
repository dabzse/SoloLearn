// pro

using System;

public class Program
{
    public static void Main(string[] args)
    {
        int age = Convert.ToInt32(Console.ReadLine());
        // your code goes here
        if (age >= 16) {
            Console.WriteLine("Welcome");
        }
        else {
            Console.WriteLine("Not allowed");
        }
    }
}