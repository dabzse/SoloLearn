import numpy as np

n, p = [int(x) for x in input().split()]

lst = []
for i in range(n):
    lst.append(input().split())
print(np.array(lst).astype(np.float16).mean(axis=1).round(2))
