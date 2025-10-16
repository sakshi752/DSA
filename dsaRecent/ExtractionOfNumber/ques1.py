# count the number of digits in an integer

num = int(input("Enter an integer : "))
ct = 0
while num>0:
    ct+=1
    num = num//10

print(f"number of digits in a number are {ct}")