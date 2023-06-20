using System;


namespace SoloLearn {
    class Program {
        static void Main(string[] args) {
            string text = Console.ReadLine();
            int intNnum = Convert.ToInt32(Console.ReadLine());
            double doubNum = Convert.ToDouble(Console.ReadLine());

            Printer.Print<string>(ref text);
            Printer.Print<int>(ref intNnum);
            Printer.Print<double>(ref doubNum);
        }
    }

    class Printer {
        // your code goes here
        public static void Print<T>(ref T a) {
            Console.WriteLine("Showing " + a);
        }
    }
}