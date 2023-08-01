## Generators
txt = input()

def words():
    # your code goes here
    for word in txt.split(' '):
        yield word

print(list(words()))
