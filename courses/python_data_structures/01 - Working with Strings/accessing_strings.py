# your code goes here
text = input()
text = text.lower()
count = 0
for char in text:
    if char in {"a", "e", "i", "o", "u"}:
        count += 1
print(count)
