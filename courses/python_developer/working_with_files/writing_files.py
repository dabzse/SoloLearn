# pro

n = int(input())

f = open("numbers.txt", "w+")
# your code goes here
for i in range(1, n+1):
    f.write(str(i) + "\n")
f.close()

f = open("numbers.txt", "r")
print(f.read())
f.close()
