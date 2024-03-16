# pro

menu = ["Fries", "Sandwich", "Cheeseburger", "Coffee", "Soda"]
# your code goes here

user_input = input()

try:
    index = int(user_input)
    if index < 0 or index >= len(menu):
        print("Item not found")
    else:
        print(menu[index])
        print("Thanks for your order")
except ValueError:
    print("Item not found")
