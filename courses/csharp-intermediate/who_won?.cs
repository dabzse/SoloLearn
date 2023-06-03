using System;


namespace SoloLearn {
    class Program {
        static void Main(string[] args) {
            string[] finalists = { "James Van", "John Smith", "Leyla Brown", "Tom Homerton", "Bob Douglas" };
            int winner = Convert.ToInt32(Console.ReadLine());

            // this should shown the winner and "Game Over"
            FinalRound finalRound = new FinalRound(finalists, winner);
        }
    }

    class FinalRound {
        public FinalRound(string[] finalists, int winner) {
            // complete the constructor
            Console.WriteLine("Winner is " + finalists[winner]);
        }

        // create destructor => "Game Over"
        ~FinalRound() {
            Console.WriteLine("Game Over");
        }
    }
}