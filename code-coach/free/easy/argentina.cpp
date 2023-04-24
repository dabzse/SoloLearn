#include <iostream>
using namespace std;

int main() {
    double peso;
    cin >> peso;

    double usd;
    cin >> usd;

    double peso_usd = 0.02;
    double price_usd = peso * peso_usd;

    if(price_usd > usd) {
        cout << "Dollars" << endl;
    }
    else {
        cout << "Pesos" << endl;
    }

    return 0;
}