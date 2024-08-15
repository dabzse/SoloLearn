# your code goes here
mpg_mean <- mean(mtcars$mpg)
mpg_sd <- sd(mtcars$mpg)

cars_within_1sd <- mtcars$mpg[(mtcars$mpg >= mpg_mean - mpg_sd) & (mtcars$mpg <= mpg_mean + mpg_sd)]
num_cars_within_1sd <- length(cars_within_1sd)

print(num_cars_within_1sd)
