class Browser:
    def __init__(self):
        self.links = []

    def is_empty(self):
        return not self.links

    def push(self, link):
        self.links.append(link)

    def pop(self):
        if self.links:
            return self.links.pop()
        else:
            return None


x = Browser()
x.push("about:blank")
x.push("www.sololearn.com")
x.push("www.sololearn.com/courses/")
x.push("www.sololearn.com/courses/python/")

while True:
    link = x.pop()
    if link is not None:
        print(link)
    else:
        break
