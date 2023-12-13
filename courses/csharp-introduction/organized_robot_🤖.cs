using System;

public class Program
{
    static void Main(string[] args)
    {
        string color = Console.ReadLine();

        // your code goes here
        if (color == "red") {
            Console.WriteLine("box #1");
        }
        else if (color == "green") {
            Console.WriteLine("box #2");
        }
        else if (color == "black") {
            Console.WriteLine("box #3");
        }
        else {
            Console.WriteLine("unknown");
        }
    }
}