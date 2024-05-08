players = [180, 172, 178, 185, 190, 195, 192, 200, 210, 190]

mean = sum(players) / len(players)
stdev = (sum((x - mean) ** 2 for x in players) / len(players)) ** 0.5

low, high = mean - stdev, mean + stdev

count = len([x for x in players if low < x < high])

print(count)