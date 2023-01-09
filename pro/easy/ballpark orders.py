order = input()

menu = {"Nachios": 6, "Pizza": 6, "Cheeseburger": 10, "Water": 4, "Coke": 5}

sum = 0
new_order = order.split(" ")

for item in new_order:
    if item in menu:
        sum += menu[item]
    else:
        sum += menu["Coke"]
print(round(sum * 1.07, 2))
