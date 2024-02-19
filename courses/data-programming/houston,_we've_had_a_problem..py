# pro

# Physical test score
physic_test = int(input())

# Flight simulation test score
flight_test = int(input())

# Combine the operations to get the final result
qualified = physic_test > 90 and flight_test > 85

# Display the result on the screen
print(qualified)