// pro

#include <iostream>
using namespace std;

/**
 * 1. Shooter
 * 2. Puzzle
 * 3. Snake
*/

// complete the method
void run(int number) {
    switch (number) {
        case 1:
            cout << "Shooter" << endl;
            break;
        case 2:
            cout << "Puzzle" << endl;
            break;
        case 3:
            cout << "Snake" << endl;
            break;
    }
}

int main() {
    int number;
    cin >> number;
    run(number);
}
