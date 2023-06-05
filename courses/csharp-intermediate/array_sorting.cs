using System;


namespace SoloLearn {
    class Program {
        static void Main(string[] args) {
            int count = Convert.ToInt32(Console.ReadLine());

            int[] numbers = new int[count];

            for (int i = 0; i < count; i++) {
                numbers[i] = Convert.ToInt32(Console.ReadLine());
            }

            // your code goes here
            Array.Sort(numbers);
            foreach (int num in numbers) {
                Console.WriteLine(num);
            }
        }
    }
}