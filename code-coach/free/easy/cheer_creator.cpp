#include <iostream>
using namespace std;

int main() {
    int yard;
    cin >> yard;

    if (yard > 10) {
        cout << "High Five\n";
    } else if (yard < 1) {
        cout << "shh\n";
    } else {
        for(int i = 0; i < yard; i++) {
            cout << "Ra!";
        }
    }

    return 0;
}