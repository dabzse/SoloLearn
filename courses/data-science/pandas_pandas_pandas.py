import numpy as np

n = int(input())

X = []
a = []
b = []
c = []
d = []

for i in range(n):
    X.append([float(x) for x in input().split()])

x1 = np.array([0.0, 0.0])
x2 = np.array([2.0, 2.0])

X = np.array(X)

for i in range(n):
    if np.sqrt(((X[i] - x1) ** 2).sum()) <= np.sqrt(((X[i] - x2) ** 2).sum()):
        a.append(X[i])
    elif np.sqrt(((X[i] - x1) ** 2).sum()) > np.sqrt(((X[i] - x2) ** 2).sum()):
        b.append(X[i])

a = np.array(a)
b = np.array(b)

sum_a_1 = 0
sum_a_2 = 0
sum_b_1 = 0
sum_b_2 = 0

# in docstring is the old style
# use enumerate instead

"""
for i in range(len(a)):
    sum_a_1 += a[i][0]
    sum_a_2 += a[i][1]


for i in range(len(b)):
    sum_b_1 += b[i][0]
    sum_b_2 += b[i][1]
"""

for i, val in enumerate(a):
    sum_a_1 += val[0]
    sum_a_2 += val[1]

for i, val in enumerate(b):
    sum_b_1 += val[0]
    sum_b_2 += val[1]

if len(a) != 0:
    sum_a_1 /= len(a)
    sum_a_2 /= len(a)
    sum_a_1 = sum_a_1.round(2)
    sum_a_2 = sum_a_2.round(2)


if len(b) != 0:
    sum_b_1 /= len(b)
    sum_b_2 /= len(b)
    sum_b_1 = sum_b_1.round(2)
    sum_b_2 = sum_b_2.round(2)

c.append(sum_a_1)
c.append(sum_a_2)
c = np.array(c)

d.append(sum_b_1)
d.append(sum_b_2)
d = np.array(d)

if len(a) == 0:
    print(None)
else:
    print(c)

if len(b) == 0:
    print(None)
else:
    print(d)
