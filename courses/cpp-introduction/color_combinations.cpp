// pro

#include <iostream>
using namespace std;

int main() {

    int n;
    cin >> n;

    int result = 1;

    // your code goes here

    for (int i = 1; i <= n; i++) {
        result *= i;
    }

    cout << result;

    return 0;
}