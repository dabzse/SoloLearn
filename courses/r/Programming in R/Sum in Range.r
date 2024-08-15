input <- readLines('stdin')
x <- as.integer(input[1])
y <- as.integer(input[2])

# define the function
range_sum <- function(x, y) {
    sum <- 0
    for(i in x:y) {
        sum <- sum + i
    }
    return(sum)
}


result <- range_sum(x, y)
print(result)