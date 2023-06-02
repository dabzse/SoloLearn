using System;


namespace SoloLearn {
    class Program {
        static void Main(string[] args) {
            string password = Console.ReadLine();
            char[] notAllowedSymbols = {'!', '#', '$', '%', '&', '(', ')', '*', ',', '+', '-',};

            // your code goes here
            if(password.IndexOfAny(notAllowedSymbols) != -1) {
                Console.WriteLine("Invalid");
            }
        }
    }
}