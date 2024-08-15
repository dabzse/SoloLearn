index <- readLines('stdin')
index <- as.integer(index[1])

x <- data.frame(
    "name" = c("James", "Amy", "David", "Bob", "John"),
    "year" = c("1988","2001", "1996", "2004", "1999")
)

get_nickname <- function(index) {
    name <- x$name[index]
    year <- x$year[index]
    nickname <- paste(name, year, sep = "")
    return(nickname)
}

output <- get_nickname(index)
cat("[1] \"", output, "\"\n", sep = "")
