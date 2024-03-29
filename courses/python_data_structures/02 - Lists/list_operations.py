data = [
    [23, 11, 5, 14],  # male   : brown, blue, green, black
    [8, 32, 20, 5],   # female : brown, blue, green, black
]
color = input()

# your code goes here
colors = ["brown", "blue", "green", "black"]
total = sum(sum(row) for row in data)

if color in colors:
    color_index = colors.index(color)
    color_total = sum(row[color_index] for row in data)
    print(int(color_total * 100 / total))
