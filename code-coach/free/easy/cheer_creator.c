#include <stdio.h>

int main() {
    int yard;
    scanf("%d", &yard);

    if (yard > 10) {
        printf("High Five\n");
    } else if (yard < 1) {
        printf("shh\n");
    } else {
        for(int i = 0; i < yard; i++) {
            printf("Ra!");
        }
        printf("\n");
    }

    return 0;
}