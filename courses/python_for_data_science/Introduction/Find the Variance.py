vac_nums = [
    0, 0, 0, 0, 0,
    1, 1, 1, 1, 1, 1, 1, 1,
    2, 2, 2, 2,
    3, 3, 3
]

# your code goes here
mean = sum(vac_nums) / len(vac_nums)
squared_diffs = [(x - mean) ** 2 for x in vac_nums]
variance = sum(squared_diffs) / len(vac_nums)
print(variance)
