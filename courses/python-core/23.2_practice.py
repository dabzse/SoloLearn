## Lists V
fruits = ["apple", "cherry", "banana", "kiwi", "lemon", "pear", "peach", "avocado"]
num = int(input())
# your code goes here
if num < 0 or num > 7:
    print("Wrong number")
else:
    print(fruits[num])