with open("/usercode/files/books.txt") as f:
    # your code goes here
    row = 1
    for line in f:
        print("Line " + str(row) + ": " + str(len(line.split(" "))) + " words")
        row += 1
