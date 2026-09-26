#include <iomanip>
#include <iostream>
#include <string>

using namespace std;

int main() {
    const string items[] = {"Nachos", "Pizza", "Cheeseburger", "Water", "Coke"};
    const double prices[] = {6.0, 6.0, 10.0, 4.0, 5.0};
    const int item_count = sizeof(items) / sizeof(items[0]);

    double total = 0.0;
    string item;

    while (cin >> item) {
        int i;
        for (i = 0; i < item_count; i++) {
            if (item == items[i]) {
                total += prices[i];
                break;
            }
        }

        if (i == item_count) {
            total += prices[item_count - 1];
        }
    }

    cout << fixed << setprecision(2) << total * 1.07 << '\n';
    return 0;
}
