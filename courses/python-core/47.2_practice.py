## Reading files
file = open("/usercode/files/pull_ups.txt")
n = int(input())

# your code goes here

lst = file.readlines()
print(lst[n])
file.close()