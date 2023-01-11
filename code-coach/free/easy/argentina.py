pesos = int(input())
dollars = int(input())

currency = pesos * 2  / 100
if currency <= dollars:
    print("Pesos")
else:
    print("Dollars")
