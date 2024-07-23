file = open("/usercode/files/books.txt", "r")

# your code goes here
content = file.readlines()
for line in content:
    words = line.split()
    for word in words:
        print(word[0], end="")
    print()

file.close()
