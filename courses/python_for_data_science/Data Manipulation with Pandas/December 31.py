import pandas as pd

df = pd.read_csv("/usercode/files/ca-covid.csv")
df.set_index("date", inplace=True)
df.drop("state", axis=1, inplace=True)

data = df.iloc[-1]
print(data)
