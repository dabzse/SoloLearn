// pro

using System;

public class Program
{
    public static void Main(string[] args)
    {
        double score1 = Convert.ToInt32(Console.ReadLine());
        double score2 = Convert.ToInt32(Console.ReadLine());
        double score3 = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine(Average(score1,score2,score3));
    }

    // complete the method
    static double Average(double s1, double s2, double s3)
    {
        return (s1 + s2 + s3) / 3;
    }
}