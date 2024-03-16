# pro


# your code goes here
def decor(fn):
    def wrap(num):
        print("***")
        fn(num)
        print("***")
        print("END OF PAGE")

    return wrap

@decor
def invoice(num):
    print("INVOICE #" + num)

invoice(input())
