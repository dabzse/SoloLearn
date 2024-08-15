input <- readLines('stdin')
number <- as.integer(input[1])

data <- data.frame(
    "id" = c(1:10),
    "grade" = c(75, 26, 54, 90, 86, 93, 48, 71, 66, 99)
)

output <- sum(data$grade > number)
cat("[1]", output, "\n")

