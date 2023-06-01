using System;


namespace SoloLearn {
    class Program {
        static void Main(string[] args) {
            // your code goes here
            int[] arr = new int[5];
            int count = 0;

            while(count < 5) {
                arr[count] = Convert.ToInt32(Console.ReadLine());
                count++;
            }
            Console.WriteLine(arr.Min() + arr.Max());
        }
    }
}