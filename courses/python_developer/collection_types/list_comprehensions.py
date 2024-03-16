# pro

word = input()
vowels = ["a", "e", "i", "o", "u"]

non_vowel_letters = [letter for letter in word if letter not in vowels]

print(non_vowel_letters)
