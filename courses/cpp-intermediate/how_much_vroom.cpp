#include <iostream>
using namespace std;

// class definition
class Car {
    // private area
    private:
        int horsepowers;

    // public area
    public:
        // complete the setter function
        void setHorsepowers(int hp) {
            horsepowers = hp;
            if(hp > 800) {
                cout << "Too much" << endl;
            }
        }

        // complete the getter function
        int getHorsepowers() {
            return horsepowers;
        }
};

int main() {
    // getting input
    int horsepowers;
    cin >> horsepowers;

    // creating the object of class Car
    Car car;

    // setting the value for private member
    car.setHorsepowers(horsepowers);

    // printing the value of private member
    cout << car.getHorsepowers() << endl;
    return 0;
}
