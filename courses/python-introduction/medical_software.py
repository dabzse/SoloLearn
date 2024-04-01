# pro

# Glucose level is an input for this software
glucose_level = int(input())

# Display message if glucose level is less than 70
if glucose_level < 70:
    print("Low glucose level")

# Display message if glucose level is greater than 140
elif glucose_level > 140:
    print("High glucose level")

# Display message if none of the conditions above are met
else:
    print("Normal range")
