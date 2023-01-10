import math

ahead = int(input())
people = math.ceil(ahead / 20)

if people == 1:
    print(10)
elif people % 2 == 0:
    print((people * 10 * 2) + 10)
else:
    print((people * 10 * 2) - 10)
