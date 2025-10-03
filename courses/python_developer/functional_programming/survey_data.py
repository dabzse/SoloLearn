user_answers = ["Yes", "", "No", "", "Maybe", "", "Yes"]

# create a new list without empty answers
# using filter with a lambda expression
answers = list(filter(lambda x: x != "", user_answers))

# display the cleaned list of answers
print(answers)
