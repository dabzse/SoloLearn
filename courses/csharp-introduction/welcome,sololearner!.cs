using System;

public class Program
{
    static void Main(string[] args)
    {
        // call the method
        Welcome();
    }

    static void Welcome()
    {
        // redesign the method
        string user = Console.ReadLine();
        Console.WriteLine($"Welcome, {user}!");
    }
}