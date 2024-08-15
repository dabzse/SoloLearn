x <- readLines('stdin')
x <- as.integer(x[1])

# define the function
stars <- function(n) {
    for (i in 1:n) {
        cat("[1] \"*\"\n")
    }
}

stars(x)
