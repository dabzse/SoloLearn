using System;


namespace SoloLearn {
    class Program {
        static void Main(string[] args) {
            string color = Console.ReadLine();
            string equipment = Console.ReadLine();

            Car car = new Car(color, equipment);

            car.GetColor();
            car.GetEquipment();
        }
    }

    public interface IColor {
        void GetColor();
    }
    public interface IEquipment {
        void GetEquipment();
    }

    // implement IColor & IEquipment interfaces
    public class Car : IColor, IEquipment {
        public string color;
        public string equipment;

        public Car(string color, string equipment) {
            this.color = color;
            this.equipment = equipment;
        }

        // reimplement this method
        public void GetColor() {
            Console.WriteLine("Color: " + color);
        }

        // reimplement this method
        public void GetEquipment() {
            Console.WriteLine("Equipment: " + equipment);
        }
    }
}