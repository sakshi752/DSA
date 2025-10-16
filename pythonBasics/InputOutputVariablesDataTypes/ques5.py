# Swap two numbers without using a third variable.

num1 = int(input("Enter number1 : "))
num2 = int(input("Enter number2 : "))

num2 = num1 + num2
num1 = num2 -num1
num2 = num2 -num1 

print(f"Number 1 : {num1} and Number 2 : {num2}")