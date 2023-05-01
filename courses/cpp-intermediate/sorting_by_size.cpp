#include <iostream>
using namespace std;

class TV {
    public:
        TV(int h, int w): height(h), width(w) {};
        void area() {
            cout << height * width;
        }
    private:
        int height;
        int width;
};

int main() {
    // your code goes here
    int y, x; // height and width
    cin >> y >> x; // height and width
    TV calc (y, x);
    calc.area();

    return 0;
}