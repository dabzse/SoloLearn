## Celsius to Fahrenheit Converter
celsius = int(input())

def conv(c):
    # your code goes here
    f = ((9/5)*c)+32
    return f

fahrenheit = conv(celsius)
print(fahrenheit)