// pro

#include <iostream>
using namespace std;

int main() {

    string breakfasts[] = {"Cinnamon Doughnuts", "Waffles", "Granola", 
            "Chorizo Burrito", "French Toast"};

    string newItem = "Fluffy Pancakes";

    int index;
    cin >> index;

    // your code goes here
    breakfasts[index] = newItem;

    for(auto item : breakfasts){
        cout << item << endl;
    }

    return 0;
}