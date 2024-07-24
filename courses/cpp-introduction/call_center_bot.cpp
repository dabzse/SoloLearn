// pro

#include <iostream>
using namespace std;

int main() {

    int number;
    cin >> number;

    /**
      * 1 => Choose language
      * 2 => Contact the operator
      * 3 => Leave feedback
    */

    // your code goes here

    switch (number) {
        case 1:
            cout << "Choose language" << endl;
            break;
        case 2:
            cout << "Contact the operator" << endl;
            break;
        case 3:
            cout << "Leave feedback" << endl;
            break;
        default:
            cout << "Unknown" << endl;
    }

    return 0;
}