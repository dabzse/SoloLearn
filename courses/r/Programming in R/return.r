x <- readLines('stdin')
x <- as.integer(x[1])

square <- function(n) {
    return(n * n)
}

result <- square(x)

print(result)
