using System;


namespace SoloLearn {
    class Program {
        static void Main(string[] args) {
            Player player1 = new Player(Difficulty.Easy);
            Player player2 = new Player(Difficulty.Medium);
            Player player3 = new Player(Difficulty.Hard);
        }
    }

    /*
        Easy => "You have 3 minutes 45 seconds"
        Medium => "You have 3 minutes 20 seconds"
        Hard => "You have 3 minutes"
    */

    class Player {
        public Player(Difficulty x) {
            // your code goes here
            Console.Write("You have 3 minutes");
            switch (x) {
                case Difficulty.Easy:
                    Console.Write(" 45 seconds");
                    break;
                case Difficulty.Medium:
                    Console.Write(" 20 seconds");
                    break;
            }
            Console.Write("\n");
        }
    }

    enum Difficulty {
        Easy,
        Medium,
        Hard
    };
}