using System;

namespace Sololearn {
    class Program {
        static void Main() {
            int sales = int.Parse(Console.ReadLine());
            int invest = 10 * 2000_000 + 1000_000;
            long monthly = (long)sales * 3000_000;

            if (monthly < invest)
                Console.WriteLine("Loss");
            else if (monthly == invest)
                Console.WriteLine("Broke Even");
            else
                Console.WriteLine("Profit");
        }
    }
}