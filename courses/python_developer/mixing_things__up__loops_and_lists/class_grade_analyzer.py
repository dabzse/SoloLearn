grades = [8.5, 7.9, 6.8, 8.2, 9, 6.3, 8.4]
count = 0

# count the number of grades above 8.0
for grade in grades:
    if grade > 8.0:
        count += 1
    continue

# display the result
print(count)

