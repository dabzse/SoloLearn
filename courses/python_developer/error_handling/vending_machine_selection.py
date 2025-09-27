products = ["Water", "Chocolate", "Chips", "Soda", "Sandwich"]
choice_index = int(input())

# Write a try-except block to display the selected product
# or print "wrong index" if the input index is out of range

try:
    print(products[choice_index])
except IndexError:
    print("wrong index")
