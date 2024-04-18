sales = gets.to_i

invest = 10 * 2000_000 + 1000_000
monthly = sales * 3000_000

if monthly < invest
    puts "Loss"
elsif monthly == invest
    puts "Broke Even"
else
    puts "Profit"
end
