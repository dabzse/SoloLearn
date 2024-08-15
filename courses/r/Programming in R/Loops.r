sum <- 0
# your code goes here
for (i in 1:1000) {
    if (i %% 3 == 0) {
        sum <- sum + i
    }
}

print(sum)
