words = ["tree", "button", "cat", "window", "defenestrate"]

# use a list comprehension to filter out words longer than four letters
word = [word for word in words if len(word) > 4]

# display the filtered list
print(word)
