text = input()
words = text.split()
awl = sum(map(len, words)) / len(words)

print(awl)
