S = [int(x) for x in input().split()]
A = [int(x) for x in input().split()]
B = [int(x) for x in input().split()]


def gini(data):
    return 2 * (data.count(1) / len(data)) * (data.count(0) / len(data))


gain = gini(S) - (len(A) / len(S)) * gini(A) - (len(B) / len(S)) * gini(B)

print(round(gain, 5))
