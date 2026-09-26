order = input().split(" ")
menu = {"Nachos": 6, "Pizza": 6, "Cheeseburger": 10, "Water": 4, "Coke": 5}
SUM = 0

for item in order:
    if item in menu:
        SUM += menu[item]
    else:
        SUM += menu["Coke"]
print(round(SUM * 1.07, 2))
