siblings = gets.chomp.to_i
popsicles = gets.chomp.to_i

# your code goes here
result = popsicles % siblings
if popsicles > 0 && result == 0
    puts "give away"
else
    puts "eat them yourself"
end