x <- read.csv('/usercode/files/titanic.csv')

# print(x)

y <- x[(x$Age >=18),]
# print(y)

z <- c(by(y$Pclass, y$Survived, mean))
print(z)
