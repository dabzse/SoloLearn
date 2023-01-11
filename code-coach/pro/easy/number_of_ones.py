decimal = int(input())
binary = bin(decimal)
number = str(binary)
cnt = 0

for nr in number:
    if nr == "1":
        cnt += 1

print(cnt)
