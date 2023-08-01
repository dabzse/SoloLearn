## Ternary Operator
balance = int(input())
to_cash = int(input())

# change the code
money_left = balance-to_cash if to_cash <= balance and to_cash >= 500 else "Error"

print(money_left)