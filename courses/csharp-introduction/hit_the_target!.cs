// pro

using System;

public class Program
{
    public static void Main(string[] args)
    {
        int points = 0;
        int arrows = 5;

        arrows -= 1;
        points += 10;

        Console.Write("Points: ");
        Console.WriteLine(points);
        Console.Write("Arrows: ");
        Console.WriteLine(arrows);
    }
}