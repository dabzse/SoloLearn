import numpy as np

data = np.array(
    [
        1, 1, 0, 0, 1,
        0, 0, 0, 0, 0,
        1, 1, 1, 1, 1,
        1, 0, 1, 0, 1,
        1, 1, 1, 0, 0,
        0, 1, 1, 1, 0,
    ]
)

row = int(input())
r_data = data.reshape(6, 5)
print(r_data[row])