yard = gets.chomp.to_i

if yard > 10
    puts "High Five"
elsif yard < 1
    puts "shh"
else
    puts "Ra!" *yard
end