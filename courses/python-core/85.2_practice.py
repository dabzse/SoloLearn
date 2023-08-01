## Character Classes
import re
id = input()

# your code goes here
if re.search(r"[A-Z][A-Z][0-9][0-9]$", id):
    print("Searching")
else:
    print("Wrong format")