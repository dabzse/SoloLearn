# pro

menu = ["Fries", "Sandwich", "Cheeseburger", "Coffee", "Soda"]
# your code goes here
user_input = input()

try:
    index = int(user_input)

    if 0 <= index < len(menu):
        print(menu[index])
        print("Thanks for your order")
    else:
        print("Item not found")
except ValueError:
    print("Item not found")
