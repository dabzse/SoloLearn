using System;
using System.Collections.Generic;

namespace SoloLearn
{
    class Program
    {
        static void Main(string[] args)
        {
            int numOfPlayers = Convert.ToInt32(Console.ReadLine());

            List<int> scores = new List<int>();
            int count = 0;
            while (count < numOfPlayers)
            {
                int score = Convert.ToInt32(Console.ReadLine());
                // your code goes here
                scores.Add(score);
                count++;
            }

            // sort the list and output elements
            scores.Sort();
            foreach (var show in scores) {
                Console.Write(show + " ");
            }
        }
    }
}