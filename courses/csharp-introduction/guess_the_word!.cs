// pro

using System;

public class Program
{
    public static void Main(string[] args)
    {
        string answer = Console.ReadLine();
        string attempt = Console.ReadLine();

        string result;

        // your code goes here
        if (answer == attempt) {
            Console.WriteLine("You win");
        }
        else {
            Console.WriteLine("You lose");
        }
    }
}