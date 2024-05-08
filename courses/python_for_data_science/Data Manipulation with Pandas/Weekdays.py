import pandas as pd

df = pd.read_csv("/usercode/files/ca-covid.csv")

df.drop("state", axis=1, inplace=True)
df["date"] = pd.to_datetime(df["date"], format="%d.%m.%y")

df["weekday"] = df["date"].dt.strftime("%A")
data = df.tail(7)
print(data)
