# Check if a character is a vowel or consonant.

ch = input("Enter a character")

if ch.lower() in ['a', 'e', 'i', 'o', 'u']:
    print("Vowel")
else:
    print("Consonant")