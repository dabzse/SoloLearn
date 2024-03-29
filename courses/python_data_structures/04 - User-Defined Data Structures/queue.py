class CallCenter:
    def __init__(self):
        self.customers = []

    def is_empty(self):
        return not self.customers

    def add(self, x):
        self.customers.insert(0, x)

    def next(self):
        return self.customers.pop()


c = CallCenter()

while True:
    n = input()
    if n == "end":
        break
    c.add(n)

# your code goes here
total_time = 0
while not c.is_empty():
    if c.next() == "general":
        total_time += 5
    else:
        total_time += 10
print(total_time)
