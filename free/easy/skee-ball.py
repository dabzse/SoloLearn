score = int(input())
rate = int(input())

tickets = score/12
if tickets >= rate:
    print("Buy it!")
else:
    print("Try again")
