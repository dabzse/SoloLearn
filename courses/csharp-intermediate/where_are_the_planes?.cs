using System;


namespace SoloLearn {
    class Program {
        static void Main(string[] args) {
            WayStatus status = new WayStatus();
        }
    }

    class Flight {
        public Flight() {
            Console.WriteLine("Registration");
        }
        ~Flight() {
            Console.WriteLine("Closed");
        }
    }

    /**
        derive this class from Flight class,
        define constructor and destructor for it
    */
    class WayStatus : Flight {
        public WayStatus() {
            Console.WriteLine("On the way");
        }
        ~WayStatus() {
            Console.WriteLine("Landed");
        }
    }
}