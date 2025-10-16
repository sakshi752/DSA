# Print the factors or divisors of a given number
import math

def factorsOfNumber(num):
    res = []
    for i in range(1,int(math.sqrt(num))+1):
        if num%i == 0:
            res.append(i)
            if num//i !=i:
                res.append(num//i)
    res.sort()
    return res

print("factors of 36 are ",factorsOfNumber(36))