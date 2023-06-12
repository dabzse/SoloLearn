using System;


namespace SoloLearn {
    class Program {
        static void Main(string[] args) {
            Figure rectangle = new Rectangle(5, 6);
            Figure triangle = new Triangle(4, 8, 3);

            Console.WriteLine(rectangle.Perimeter());
            Console.WriteLine(triangle.Perimeter());
        }
    }

    abstract class Figure {
        // define abstract method Perimeter with no body
        public abstract int Perimeter();
    }

    class Rectangle : Figure {
        public int width;
        public int height;
        public Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }
        // override Perimeter method for rectangle
        public override int Perimeter() {
            return (width + height) * 2;
        }
    }

    class Triangle : Figure {
        public int side1;
        public int side2;
        public int side3;
        public Triangle(int s1, int s2, int s3) {
            this.side1 = s1;
            this.side2 = s2;
            this.side3 = s3;
        }
        // override Perimeter method for triangle
        public override int Perimeter() {
            return side1 + side2 + side3;
        }
    }
}