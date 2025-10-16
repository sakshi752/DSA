# Function to return factorial of a number.

def factorial(num):
    if num == 1:
        return 1
    elif num == 0:
        return 0
    res = 1
    for i in range(1,num+1):
        res *= i
    return res

print("factorial of 5 ",factorial(5))