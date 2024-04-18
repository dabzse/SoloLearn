#include <stdio.h>

int main() {
    int sales;
    scanf("%d", &sales);

    long long invest = 10LL * 2000000 + 1000000;
    long long monthly = (long long)sales * 3000000;

    if (monthly < invest) {
        printf("Loss\n");
    }
    else if (monthly == invest) {
        printf("Broke Even\n");
    }
    else {
        printf("Profit\n");
    }

    return 0;
}