using System;


namespace SoloLearn {
    class Program {
        static void Main(string[] args) {
            Project project = new Project();
        }
    }
    class Project {
        // create a constructor to show "Project created"
        public Project() {
            Console.WriteLine("Project created");
        }
    }
}