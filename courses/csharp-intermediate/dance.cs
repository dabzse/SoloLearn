using System;


namespace Code_Coach_Challenge {
    public class Program {
        public static void Main(string[] args) {
            string name1 = Console.ReadLine();
            int points1 = int.Parse(Console.ReadLine());
            string name2 = Console.ReadLine();
            int points2 = int.Parse(Console.ReadLine());

            DancerPoints dancer1 = new DancerPoints(name1, points1);
            DancerPoints dancer2 = new DancerPoints(name2, points2);

            DancerPoints total = dancer1 + dancer2;
            Console.WriteLine(total.name);
            Console.WriteLine(total.points);
        }
    }

    public class DancerPoints {
        public string name;
        public int points;

        public DancerPoints(string name, int points) {
            this.name = name;
            this.points = points;
        }

        // overload the + operator
        public static DancerPoints operator +(DancerPoints a, DancerPoints b) {
            string name = $"{a.name} & {b.name}";
            int points = a.points + b.points;
            return new DancerPoints(name, points);
        }
    }
}