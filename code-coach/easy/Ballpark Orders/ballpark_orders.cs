using System;

class Program
{
    static void Main(string[] args)
    {
        string[] items = { "Nachos", "Pizza", "Cheeseburger", "Water", "Coke" };
        double[] prices = { 6.0, 6.0, 10.0, 4.0, 5.0 };

        double total = 0.0;
        string item;

        item = Console.ReadLine();
        string[] orders = item.Split(' ');

        foreach (string order in orders)
        {
            int i;
            for (i = 0; i < items.Length; i++)
            {
                if (order == items[i])
                {
                    total += prices[i];
                    break;
                }
            }

            if (i == items.Length)
            {
                total += prices[prices.Length - 1];
            }
        }

        Console.WriteLine(total * 1.07);
    }
}
