using System;

public class Program
{
    static void Main(string[] args)
    {
        int width = Convert.ToInt32(Console.ReadLine());
        int length = Convert.ToInt32(Console.ReadLine());

        // output the result
        Console.WriteLine(Area(width, length));
    }


    // fix the method
    static int Area(int w, int l)
    {
        int res = w * l;
        return res;
    }
}