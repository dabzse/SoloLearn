## Longest Word
txt = input()

# your code goes here
l = max(txt.split(), key=len)
print(l)