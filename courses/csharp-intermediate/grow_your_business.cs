using System;


namespace SoloLearn {
    class Program {
        static void Main(string[] args) {
            int numOfDeps = Convert.ToInt32(Console.ReadLine());

            int count = 0;
            while(count < numOfDeps) {
                string depName = Console.ReadLine();
                Department dep = new Department(depName);
                count++;
            }

            Console.WriteLine("Number of departments: " + Department.depCount);
        }
    }

    class Department {
        public string depName;

        // declare static depCount member with value of 2
        public static int depCount = 2;

        // complete the constructor
        public Department(string name) {
            Console.WriteLine("Department opened: " + name);
            this.depName = name;
            depCount++;
        }
    }
}