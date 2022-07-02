sales = int(input())

invest = 10 * 2000_000 + 1000_000
monthly = sales * 3000_000
# NOTE: using "_" in large numbers is unnecessary, but useful!

if monthly < invest:
    print("Loss")
elif monthly == invest:
    print("Broke Even")
else:
    print("Profit")
