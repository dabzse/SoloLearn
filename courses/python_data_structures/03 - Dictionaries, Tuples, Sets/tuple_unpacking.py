points = [
    (12, 55),
    (880, 123),
    (64, 64),
    (190, 1024),
    (77, 33),
    (42, 11),
    (0, 90)
]
# your code goes here

min_distance = float('inf')
for point in points:
    distance = ((point[0] - 0) ** 2 + (point[1] - 0) ** 2) ** 0.5
    if distance < min_distance:
        min_distance = distance
print(min_distance)
