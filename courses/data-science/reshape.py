import numpy as np

r = int(input())
lst = [float(x) for x in input().split()]
arr = np.array(lst)

y = arr.reshape(r, int(len(lst) / r))
print(y)
