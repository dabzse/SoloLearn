#include <stdio.h>
#include <math.h>

int main() {
    int houses;
    double value;
    scanf("%d", &houses);

    // your code goes here
    value = 2 * 100.0 / houses;
    printf("%d\n", (int)ceil(value));

    return 0;
}