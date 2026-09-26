menu = {
    "Nachos" => 6.0,
    "Pizza" => 6.0,
    "Cheeseburger" => 10.0,
    "Water" => 4.0,
    "Coke" => 5.0
}

order = gets.chomp.split(" ")
total = 0.0

order.each do |item|
    if menu.has_key?(item)
        total += menu[item]
    else
        total += menu["Coke"]
    end
end

tax = total * 0.07
final_total = total + tax
puts "%.2f" % final_total
