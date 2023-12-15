// pro

using System;

public class Program
{
    public static void Main(string[] args)
    {
        int number = Convert.ToInt32(Console.ReadLine());

        // your code goes here
        switch(number) {
            case 1:
                Console.WriteLine("Light");
                break;
            case 2:
                Console.WriteLine("Dark");
                break;
            case 3:
                Console.WriteLine("Indigo");
                break;
        }
    }
}