#include <iostream>
using namespace std;


class Product {
    protected:
        double price;
        int weight;
    public:
        void info() {
            cout << price << ", " << weight << endl;
        }
};

class Fruit : public Product {
    public:
        string type;
        void setInfo(double p, int w) {
            price = p;
            weight = w;
        }
};

int main() {
    Fruit obj;
    obj.type = "Apple";
    obj.setInfo(4.99, 10);
    obj.info();

    return 0;
}