// pro

#include <iostream>
using namespace std;

int main() {

    string password, attempt;
    cin >> password >> attempt;

    // your code goes here
    if (password == attempt) {
        cout << "Welcome" << endl;
    }
    else {
        cout << "Try again" << endl;
    }

    return 0;
}