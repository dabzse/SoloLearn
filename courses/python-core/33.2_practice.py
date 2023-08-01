## Functions Arguments
password = input()
repeat = input()

def validate(text1, text2):
	# your code goes here
    if text1 == text2:
        print("Correct")
    else:
        print("Wrong")

validate(password, repeat)