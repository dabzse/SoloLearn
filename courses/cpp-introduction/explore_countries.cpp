// pro

#include <iostream>
using namespace std;

int main() {

    int population, area;
    cin >> population >> area;

    // your code goes here
    if (population < 10000 && area < 10000) {
        cout << "Small country" << endl;
    }

    return 0;
}