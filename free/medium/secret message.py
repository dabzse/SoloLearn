message = input()

for ch in message.lower():
    if ch.isalpha(): 
        print(chr(ord("a")+ord("z")-ord(ch)))
    else:
        print(c)
