x <- readLines('stdin')
num <- as.integer(x[1])
# your code goes here

if (num %% 2 == 0) {
    print("even")
} else {
    print("odd")
}
