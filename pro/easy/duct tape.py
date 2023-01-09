import math


heigth = int(input())
width = int(input())
door = heigth * width * 2

# duct1 = 60/12
# duct2 = 2
# ducts = duct1 * duct2
# print(math.ceil(door / ducts))

# or use the easiest way: just "hardcode" 10, it's permanent

print(math.ceil(door / 10))
