# pro

N = int(input())

with open("numbers.txt", "w") as file:
    for i in range(1, N + 1):
        file.write(str(i) + "\n")

# Reading and outputting the content of the file
with open("numbers.txt", "r") as file:
    for line in file:
        print(line.strip())
