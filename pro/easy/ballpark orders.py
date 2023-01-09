order = input().split(" ")
menu = {"Nachios": 6, "Pizza": 6, "Cheeseburger": 10, "Water": 4, "Coke": 5}
sum = 0

for item in order:
    if item in menu:
        sum += menu[item]
    else:
        sum += menu["Coke"]
print(round(sum * 1.07, 2))
