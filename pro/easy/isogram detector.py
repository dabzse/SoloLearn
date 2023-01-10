text = input().lower()
cnt = 0
for letter in text:
    cnt += text.count(letter)

if cnt == len(text):
    print('true')
else:
    print('false')
