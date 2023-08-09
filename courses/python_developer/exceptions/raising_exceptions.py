tweet = input()

try:
    # your code goes here
    if len(tweet) > 42:
        raise Exception()
except:
    print("Error")
else:
    print("Posted")
