tp, fp, fn, tn = [int(x) for x in input().split()]

accuracy = (tp + tn) / (tp + fp + fn + tn)
precision = tp / (tp + fp)
recall = tp / (tp + fn)
f1 = (2 * precision * recall) / (precision + recall)

output = [accuracy, precision, recall, f1]
for i in output:
    print(round(i, 4))
