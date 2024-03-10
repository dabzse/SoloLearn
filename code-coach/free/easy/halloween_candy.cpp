#include <iostream>
#include <cmath>

using namespace std;
int main() {
    int houses;
    double value;

    cin >> houses;

    // your code goes here
    value = 2 * 100.0 / houses;
    cout << static_cast<int>(ceil(value)) << endl;

    return 0;
}