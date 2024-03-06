using System;

namespace Sololearn {
    class Program {
        static void Main(string[] args) {
            int siblings, popsicles;
            siblings = Convert.ToInt32(Console.ReadLine());
            popsicles = Convert.ToInt32(Console.ReadLine());

            // your code goes here
            if (popsicles > 0 && popsicles % siblings == 0) {
                Console.WriteLine("give away");
            }
            else {
                Console.WriteLine("eat them yourself");
            }
        }
    }
}
