## Returning from Functions
s = input()

def hashtagGen(text):
	# your code goes here
    s1 = s.replace(" ", "")
    s2 = "#"+s1
    return s2

print(hashtagGen(s))