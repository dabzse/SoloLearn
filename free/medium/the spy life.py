message = input()

for ch in message[::-1]:
    if ch.isalpha() or ch.isspace():
        print(ch)
