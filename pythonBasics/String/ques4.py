# Count frequency of each character in a string

str = input("Enter your string : ")

frequency = {}

for ch in str:
    if ch in frequency:
        frequency[ch] +=1
    else:
        frequency[ch] = 1

for key,value in frequency.items():
    print(f"{key} : {value}")