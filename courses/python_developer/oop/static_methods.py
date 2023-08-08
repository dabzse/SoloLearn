# your code goes here
class Shape:
    def __init__(self, w, h):
        self.width = w
        self.height = h
    @staticmethod
    def area(w, h):
        return w * h

w = int(input())
h = int(input())

print(Shape.area(w, h))
