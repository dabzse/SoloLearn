file = open("/usercode/files/books.txt")
# your code goes here

num = int(input())
line = file.read()

print(line[:num])
file.close()
