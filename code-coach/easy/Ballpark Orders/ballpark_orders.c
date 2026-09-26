#include <stdio.h>
#include <string.h>

int main(void) {
    const char *items[] = {"Nachos", "Pizza", "Cheeseburger", "Water", "Coke"};
    const double prices[] = {6.0, 6.0, 10.0, 4.0, 5.0};
    const int item_count = 5;

    char item[50];
    double total = 0.0;

    while (scanf("%49s", item) == 1) {
        int i;
        for (i = 0; i < item_count; i++) {
            if (strcmp(item, items[i]) == 0) {
                total += prices[i];
                break;
            }
        }

        if (i == item_count) {
            total += prices[item_count - 1];
        }
    }

    printf("%.2f\n", total * 1.07);
    return 0;
}
