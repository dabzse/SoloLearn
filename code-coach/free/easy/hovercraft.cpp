#include <iostream>
using namespace std;

int main() {
    int sales;
    cin >> sales;

    long long invest = 10 * 2000000 + 1000000;
    long long monthly = static_cast<long long>(sales) * 3000000;

    if (monthly < invest) {
        cout << "Loss" << endl;
    }
    else if (monthly == invest) {
        cout << "Broke Even" << endl;
    }
    else {
        cout << "Profit" << endl;
    }

    return 0;
}