def isNumberPalindrome(num):
    temp = num
    revNum = 0
    while(temp>0):
        lastdigit =  temp % 10
        revNum =revNum*10 +lastdigit
        temp = temp // 10
    if revNum == num:
        return True
    else : return False


num = int(input("Enter number : "))

print("num is palindrome") if isNumberPalindrome(num)  else print("num is not palindrome")