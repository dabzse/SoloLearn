# pro

# take the initial cell population as input
cells = int(input())

# take the number of days as input
days = int(input())

# initialize the day counter
counter = 1

# complete the while loop
while counter <= days:
    cells *= 2
    # Daily message
    print("Day " + str(counter) + ": " +str(cells))
    counter += 1