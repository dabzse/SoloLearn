using System;

namespace SoloLearn {
    class Program {
        static void Main(string[] args) {
            Card card1 = new Card();

            // fix the output
            Console.WriteLine(card1.AccountNum);
        }
    }
    class Card {
        private string accountNum = "0011592048120";
        // create a property to get the account
        public string AccountNum {
            get { return accountNum; }
        }
    }
}