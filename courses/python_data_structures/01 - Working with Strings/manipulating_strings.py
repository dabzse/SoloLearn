text = "Amy has 128 dollars, while David has 54 dollars. Amy is going to the zoo. David watches soccer."

substring = input()
replacement = input()
count = text.count(substring)
text = text.replace(substring, replacement)
print(count)
print(text)
