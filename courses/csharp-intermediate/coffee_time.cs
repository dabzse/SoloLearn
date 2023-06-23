using System;
using System.Collections.Generic;

namespace SoloLearn
{
    class Program
    {
        static void Main(string[] args)
        {
            int discount = Convert.ToInt32(Console.ReadLine());

            Dictionary<string, double> coffee = new Dictionary<string, double>();
            coffee.Add("Americano", 50);
            coffee.Add("Latte", 70);
            coffee.Add("Flat White", 60);
            coffee.Add("Espresso", 60);
            coffee.Add("Cappuccino", 80);
            coffee.Add("Mocha", 90);

            // your code goes here
            foreach(KeyValuePair<string, double> entry in coffee) {
                Console.WriteLine(entry.Key + ": " + (entry.Value - entry.Value * discount / 100));
            }
        }
    }
}