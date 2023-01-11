ap1 = input().split(",")
ap2 = input().split(",")

sqr1 = int(ap1[0]) * int(ap1[1])
sqr2 = int(ap2[0]) * int(ap2[1])

result = "Apartment A" if sqr1 > sqr2 else "Apartment B"
print(result)
