using System;


namespace SoloLearn {
    class Program {
        static void Main(string[] args) {
            int[] numbers = new int[5];
            int count = 0;
            while (count < 5) {
                numbers[count] = Convert.ToInt32(Console.ReadLine());
                count++;
            }
            // your code goes here
            int sum = 0;
            for(int i = 0; i < numbers.Length; i++) {
                if(numbers[i] %2 == 0) {
                    sum += numbers[i];
                }
            }
            Console.WriteLine(sum);
        }
    }
}