# pro


def my_min(x, *args):
    minimum = x
    for number in args:
        if number < minimum:
            minimum = number
    return minimum

print(my_min(8, 13, 4, 42, 120, 7))
