using System;

namespace Sololearn {
    class Program
    {
        static void Main(string[] args)
        {
            int fruit = int.Parse(Console.ReadLine());

            // your code goes here
            int apple = fruit / 2;
            int pie = apple / 3;

            Console.WriteLine(pie);
        }
    }
}