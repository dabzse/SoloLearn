## https://sololearn.com/uploads/files/one.csv

import pandas as pd
import numpy as np

filename = input()
column_name = input()

df = pd.read_csv(filename)
arr = np.array(df[column_name])
print(arr)
