# Count number of digits in a number.

num = 23566
ct =0

while num!=0:
    num = num // 10
    ct+=1

print("number of digits : ",ct)