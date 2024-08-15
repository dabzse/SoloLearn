colors <- c("Red", "Green", "Blue", "Purple", "Black", "Yellow", "Orange", "Pink", "Brown", "White")

color_picker <- function(index) {
    return(paste0("\"", colors[index], "\""))
}

x <- as.integer(readLines('stdin')[1])
cat("[1]", color_picker(x), "\n")
