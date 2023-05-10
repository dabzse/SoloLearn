#include <iostream>
using namespace std;


class Game {
    public:
        Game() {
            cout << "Game Started" << endl;
        }
        // destructor goes here
        ~Game() {
            cout << "Game Over" << endl;
        }
};

class Quiz : public Game {
    public:
        Quiz() {
            cout << "Quiz Started" << endl;
        }
        // destructor goes here
        ~Quiz() {
            cout << "Quiz Over" << endl;
        }
};

int main() {
    Quiz q;

    return 0;
}