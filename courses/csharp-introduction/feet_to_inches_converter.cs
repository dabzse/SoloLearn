using System;

public class Program
{
    static void Main(string[] args)
    {
        double foot = Convert.ToDouble(Console.ReadLine());
        Converter(foot);
    }

    // your code goes here
    static void Converter(double foot)
    {
        double inch = foot * 12;
        Console.WriteLine(inch);
    }
}