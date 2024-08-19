#include <iostream>
using namespace std;

void bot(int mode, string name) {
    switch (mode) {
        case 1:
            cout << "Welcome, " << name << "!" << endl;
            break;
        case 2:
            cout << "Goodbye, " << name << "!" << endl;
            break;
        default:
            cout << "Try again" << endl;
            break;
    }
}

int main() {
    int mode;
    cin >> mode;

    string name;
    cin >> name;

    bot(mode, name);
}
