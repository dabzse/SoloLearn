#include <iostream>
using namespace std;

template <class T>
class Queue {
    int size;
    T* queue;
    int max_size;

    public:
        Queue() {
            size = 0;
            max_size = 100;
            queue = new T[max_size];
        }

        void add(T data) {
            queue[size] = data;
            size++;
        }

        void remove() {
            if(size == 0) {
                cout << "Queue is empty" << endl;
                return;
            }
            else {
                for(int i = 0; i < size-1; i++) {
                    queue[i] = queue[i+1];
                }
                size--;
            }
        }

        void print() {
            if(size == 0) {
                cout << "Queue is empty" << endl;
                return;
            }
            for(int i = 0; i < size; i++) {
                cout << queue[i] << " <- ";
            }
            cout << endl;
        }

        Queue operator+(Queue &obj) {
            Queue res;
            for(int i = 0; i < this->size; i++) {
                res.add(this->queue[i]);
            }
            for(int i = 0; i < obj.size; i++) {
                res.add(obj.queue[i]);
            }
            return res;
        }
};

int main() {
    Queue <int> q1;
    q1.add(42);
    q1.add(2);
    q1.add(8);
    q1.add(1);
    q1.print();

    Queue <string> q2;
    q2.add("Dave")
    q2.add("John");
    q2.add("Amy");
    q2.print();

    return 0;
}