import math


w1, w2, b, x1, x2 = [float(x) for x in input().split()]

activation_function = -1 * ((w1 * x1) + (w2 * x2) + b)
y = 1 / (1 + math.e**activation_function)
print(round(y, 4))
