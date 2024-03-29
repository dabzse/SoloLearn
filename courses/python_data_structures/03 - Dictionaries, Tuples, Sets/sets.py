s1 = input()
s2 = input()

s1 = set(s1.split())
s2 = set(s2.split())
print(len(s1 & s2))
# print(len(s1.intersection(s2)))
