# Check if a string is palindrome.

str = "level"
j = len(str)-1
isPalindrome = True

print("len ",j)

for i in range(len(str)//2):
    if str[i] != str[j]:
        isPalindrome = False
    j=j-1

if isPalindrome:
    print("string is palindrome")
else:
    print("string is not palindrome")