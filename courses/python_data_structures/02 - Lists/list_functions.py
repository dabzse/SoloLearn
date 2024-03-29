prices = [
    125000,
    78000,
    110000,
    65000,
    300000,
    250000,
    210000,
    150000,
    165000,
    140000,
    125000,
    85000,
    90000,
    128000,
    230000,
    225000,
    100000,
    300000,
]
# your code goes here
average_price = sum(prices) / len(prices)
above_average = 0
for price in prices:
    if price > average_price:
        above_average += 1
print(above_average)
