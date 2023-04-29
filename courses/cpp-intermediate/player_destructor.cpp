#include <iostream>
using namespace std;

class Player {
    public:
        int points;
        Player(int x) {
            points = x;
            points %= 5;
        }
        // define the destructor
        ~Player() {
            cout << points << endl;
        }
};

int main() {
    int points;
    cin >> points;
    Player obj(points);
}