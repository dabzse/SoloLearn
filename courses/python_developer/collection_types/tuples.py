contacts = [
    ('James', 42),
    ('Amy', 24),
    ('John', 31),
    ('Amanda', 63),
    ('Bob', 18)
]

name = input()

for nm in contacts:
    if name in nm:
        print(nm[0] + " is " + str(nm[1]))
        break
else:
    print("Not Found")
