# pro

# Convert the values into numbers
wins = int(input())
ties = int(input())

# 1 win = 3 points
# 1 tie = 1 point
# Calculate the score
score = wins * 3 + ties

# Concatenate the 2 strings to produce a message
message = "Score: " + str(score)


# Display the message
print(message)