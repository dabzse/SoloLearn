# CA - California
# NY - New York
# FL - Florida
# OH - Ohio

state <- readLines('stdin')
# your code goes here

get_state_name <- function(state_code) {
    state_name <- switch(state_code,
                        CA = "California",
                        NY = "New York",
                        FL = "Florida",
                        OH = "Ohio",
                    )
    return(state_name)
}

output <- get_state_name(state)
cat("[1] \"", output, "\"\n", sep = "")