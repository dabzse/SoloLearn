from sklearn.metrics import confusion_matrix

y_true = [x for x in input().split()]
y_pred = [x for x in input().split()]

print((confusion_matrix(y_pred, y_true, labels=["1", "0"])) / 1)
