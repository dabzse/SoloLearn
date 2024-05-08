import pandas as pd

data = {
    "name": ["James", "Billy", "Bob", "Amy", "Tom"],
    "number": ["1234", "5678", "2222", "1111", "0909"],
}

df = pd.DataFrame(data).set_index("name")

name_search = input()
row = df.loc[name_search]
print(pd.Series({"name": name_search, "number": row["number"]}, name=name_search))
