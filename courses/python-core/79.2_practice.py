## Properties
class Number:
    def __init__(self, num):
        self.value = num

    # your code goes here
    @property
    def is_even(self):
        if self.value % 2 == 0:
            return True
        else:
            return False

x = Number(int(input()))
print(x.is_even)