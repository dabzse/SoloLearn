order = int(input())
price = 5.00
total = order*price

if order == 1:
    tax = total*7/100
    print(total + tax)
else:
    disc = total*10/100
    tax = (total - disc)*7/100
    payment = total - disc + tax
    print(round(payment, 2))
