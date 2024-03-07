using System;

namespace Sololearn {
    class Program
    {
        static void Main(string[] args)
        {
            int houses;
            double value;

            houses = Convert.ToInt32(Console.ReadLine());

            // your code goes here
            value = 2 * 100.0 / houses;
            Console.WriteLine(Math.Ceiling(value));
        }
    }
}