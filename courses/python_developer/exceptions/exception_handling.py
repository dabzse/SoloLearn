def withdraw(amount):
    print(str(amount) + " withdrawn!")

# your code goes here
money = input()
try:
    int(money)
    withdraw(money)
except:
    print("Please enter a number")
