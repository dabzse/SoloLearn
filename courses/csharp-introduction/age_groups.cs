using System;

public class Program
{
    static void Main(string[] args)
    {
        int age = Convert.ToInt32(Console.ReadLine());

        // your code goes here
        if (age >= 0 && age <= 11) {
            Console.WriteLine("Child");
        }
        else if (age >= 12 && age <= 17) {
            Console.WriteLine("Teen");
        }
        else if (age >= 18 && age <= 64) {
            Console.WriteLine("Adult");
        }
    }
}