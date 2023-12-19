// pro

using System;

public class Program
{
    public static void Main(string[] args)
    {
        int floors = Convert.ToInt32(Console.ReadLine());

        // your code goes here
        for (int i = 5; i <= floors; i+=5) {
            if (i <= floors) {
                Console.WriteLine(i);
            }
        }
    }
}