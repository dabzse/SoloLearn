using System;


namespace SoloLearn {
    class Program {
        static void Main(string[] args) {
            int[,] num = { { 1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
            // your code goes here
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    Console.Write(num[i, j]);
                }
                Console.WriteLine();
            }
        }
    }
}