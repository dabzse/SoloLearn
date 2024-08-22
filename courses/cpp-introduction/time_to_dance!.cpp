// pro

#include <iostream>
using namespace std;

// complete the method
double average(int score1, int score2, int score3) {
    double avg = (score1 + score2 + score3) / 3;
    return avg;
}

int main() {
    double score1, score2, score3;
    cin >> score1 >> score2 >> score3;

    double result = average(score1, score2, score3);

    cout << result;

    return 0;
}