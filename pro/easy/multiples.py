num = int(input())
nums = []
sum = 0

for i in range(3, num):
    if i % 3 == 0 or i % 5 == 0:
        nums.append(i)

for nr in nums:
    sum += nr

print(sum)
