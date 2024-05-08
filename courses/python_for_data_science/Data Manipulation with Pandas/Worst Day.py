import pandas as pd

df = pd.read_csv("/usercode/files/ca-covid.csv")

df.drop("state", axis=1, inplace=True)
df["date"] = pd.to_datetime(df["date"], format="%d.%m.%y")
df["month"] = df["date"].dt.month_name()
df.set_index("date", inplace=True)

input_month = input()
month_data = df[df["month"] == input_month]["cases"].max()
print(df[df["cases"] == month_data])
