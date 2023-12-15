using System;

public class Program
{
    static void Main(string[] args)
    {
        int choice = Convert.ToInt32(Console.ReadLine());

        // your code goes here
        switch(choice) {
            case 1:
                Console.WriteLine("Americano");
                break;
            case 2:
                Console.WriteLine("Espresso");
                break;
            case 3:
                Console.WriteLine("Cappuccino");
                break;
            default:
                Console.WriteLine("Unknown");
                break;
        }
    }
}