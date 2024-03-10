using System;

namespace Sololearn {
    class Program {
        static void Main(string[] args) {
            int yard;
            if (int.TryParse(Console.ReadLine(), out yard)) {
                if (yard > 10) {
                    Console.WriteLine("High Five");
                }
                else if (yard < 1) {
                    Console.WriteLine("shh");
                }
                else {
                    for (int i = 0; i < yard; i++) {
                        Console.Write("Ra!");
                    }
                }
            }
        }
    }
}