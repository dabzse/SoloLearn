def balanced(expression):
    # your code goes here
    item = []
    for i in expression:
        if i == "(":
            item.insert(0, i)
        if i == ")":
            if "(" in item:
                item.pop()
            else:
                return False
    if item:
        return False
    else:
        return True


print(balanced(input()))
