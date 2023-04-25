#include <iostream>
#include <string>
using namespace std;

class Painting {
    public:
        // define the constructor
        Painting(string nm) {
            name = nm;
            cout << nm << endl;
        }
        string getName() {
            return name;
        }
    private:
        string name;
};

int main() {
    string tmp;
    string name = "";

    while(cin >> tmp) {
        name += tmp + " ";
    }

    Painting painting(name);

    return 0;
}