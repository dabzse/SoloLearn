import re
import math

text = input()
words = float(len(re.sub('\W+', ' ', text).split()))
letters = float(len(re.sub('\W+', '', text)))
print(math.ceil(letters/words))
