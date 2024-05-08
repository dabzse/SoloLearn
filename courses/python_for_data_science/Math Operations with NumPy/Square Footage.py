import numpy as np

data = np.array([1000, 2500, 1400, 1800, 900, 4200, 2200, 1900, 3500])

add_house = int(input())
data = np.append(data, add_house)
sorted_data = np.sort(data)
print(sorted_data)
