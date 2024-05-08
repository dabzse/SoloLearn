import pandas as pd

data = {
    "name": ["James", "Billy", "Bob", "Amy", "Tom", "Harry"],
    "rank": [4, 1, 3, 5, 2, 6],
}

df = pd.DataFrame(data, index=data["name"])

user_input = int(input())
rank = int(user_input)
row = df[df["rank"] == rank]
print(row["name"])
