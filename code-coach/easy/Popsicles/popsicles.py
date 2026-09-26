siblings = int(input())
popsicles = int(input())

# your code goes here
result = popsicles % siblings
if popsicles > 0 and result == 0:
    print("give away")
else:
    print("eat them yourself")
