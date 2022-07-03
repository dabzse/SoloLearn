txt = input()

for ch in txt:
    if ch.isalnum() or ch.isspace():
        print(ch)
