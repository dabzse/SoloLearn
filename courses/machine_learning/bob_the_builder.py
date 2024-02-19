from sklearn.linear_model import LogisticRegression

n = int(input())
X = []
for i in range(n):
    X.append([float(x) for x in input().split()])
y = [int(x) for x in input().split()]
datapoint = [float(x) for x in input().split()]

model = LogisticRegression()
model.fit(X, y)
y_predict = model.predict([datapoint])
print(y_predict[0])
