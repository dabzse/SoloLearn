// pro

using System;

public class Program
{
    public static void Main(string[] args)
    {
        int number = Convert.ToInt32(Console.ReadLine());

        Run(number);
    }

    // complete the method
    /**
        1. Shooter 🔫
        2. Puzzle 🧩
        3. Snake 🐍
    */
    static void Run(int num)
    {
        switch (num)
        {
            case 1:
                Console.WriteLine("Shooter");
                break;
            case 2:
                Console.WriteLine("Puzzle");
                break;
            case 3:
                Console.WriteLine("Snake");
                break;
        }
    }
}