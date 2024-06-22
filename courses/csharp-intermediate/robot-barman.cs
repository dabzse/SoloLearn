using System;


namespace SoloLearn {
    class Program {
        static void Main(string[] args) {
            try {
                int drinks = Convert.ToInt32(Console.ReadLine());
                int shelves = Convert.ToInt32(Console.ReadLine());

                // your code goes here
                Console.WriteLine(drinks / shelves);
            }

            /**
            * 1. DivideByZeroException => "At least 1 shelf"
            * 2. FormatException => "Please insert an integer"
            */
            catch (DivideByZeroException) {
                Console.WriteLine("At least 1 shelf");
            }
            catch (FormatException) {
                Console.WriteLine("Please insert an integer");
            }
        }
    }
}