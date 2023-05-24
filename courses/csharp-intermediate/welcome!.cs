using System;

namespace SoloLearn {
    class Program {
        static void Main(string[] args) {
            // create a Welcome object with the same name
            Welcome welcome = new Welcome();
            welcome.WelcomeMessage();
        }
    }

    class Welcome {
        // complete the class, add WelcomeMessage() method
        public void WelcomeMessage() {
            Console.WriteLine("Welcome to OOP");
        }
    }
}