try:
    name = input()
    # your code goes here
    if len(name) < 4:
        raise ValueError
except:
    print("Invalid Name")
else:
    print("Account Created")
