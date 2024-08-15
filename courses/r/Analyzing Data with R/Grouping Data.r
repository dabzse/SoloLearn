# your code goes here
mtcars_auto <- subset(mtcars, am == 0)
cyl_max_hp <- tapply(mtcars_auto$hp, mtcars_auto$cyl, max)
print(cyl_max_hp)
