# Count vowels in a string.

str = "sajjerwiow"
ct =0

for ch in str:
    if ch.lower() in 'aeiou':
        ct+=1

print("number of vowels is : ",ct)

