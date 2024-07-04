# pro

# Take steps and minutes as inputs
steps = int(input())
active_minutes = int(input())

# Store the result of the operations in the variable
goal_achieved = steps > 10_000 or active_minutes > 30

# Display the result on the screen
print(goal_achieved)
