snacks = {"Lettuce": 5, "Carrot": 4, "Mango": 9, "Cheeseburger": 0}
points_need = 10
points_have = 0

feeding = input().split(" ")
for item in feeding:
    if item in snacks:
        points_have += snacks[item]

msg = "Come on Down!" if points_have >= points_need else "Time to wait"
print(msg)
