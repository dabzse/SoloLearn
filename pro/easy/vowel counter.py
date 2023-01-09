vowels = ["a", "e", "i", "o", "u"]
nr = 0

string = input().strip().lower()
for letter in string:
    if letter in vowels:
        nr += 1

print(nr)
