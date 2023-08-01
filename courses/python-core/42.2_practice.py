## Exception Handling
pin = input()

try:
	# your code goes here
    pin = int(pin)
    print("PIN code is created")

except ValueError:
	# and here
    print("Please enter a number")