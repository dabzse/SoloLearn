using System;


namespace SoloLearn {
    class Program {
        static void Main(string[] args) {
            string[] games = { "Alien Shooter", "Tic Tac Toe", "Snake", "Puzzle", "Football" };

            // your code goes here
            int N = Convert.ToInt32(Console.ReadLine());

            // # this will enough to complete the problem, but I just left there an N >= 0 &&
            // # if(N <= games.Length-1) {
            if(N >= 0 && N <= games.Length-1) {
                Console.WriteLine(games[N]);
            }
            else {
                Console.WriteLine("Invalid number");
            }
        }
    }
}