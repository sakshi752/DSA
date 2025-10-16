# Check num is armstrong number or not

def NumOfDigits(num):
    ct =0
    while num > 0:
        ct+=1
        num=num//10
    return ct

def isArmStrongNumber(num):
    digits = NumOfDigits(num)
    res = 0
    while num>0:
        ld = num % 10
        res = res + ld ** digits
        num = num // 10
    return res

num = int(input("Enter number : "))

print("num is armStrong number") if isArmStrongNumber(num) == num  else print("num is not armStrong number")