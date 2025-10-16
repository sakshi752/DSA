
# Write a program to find the sum, difference, product, and quotient of two numbers.

num1 = int(input("Enter num1 : "))
num2 = int(input("Enter num2 : "))

print(f"sum of num1 and num2 {num1+num2}")
print(f"Sub of num1 and num2: {num1 - num2 if num1 > num2 else num2 - num1}")
print(f"mul of num1 and num2 {num1*num2}")
print(f"div of num1 and num2 {num1/num2}")
print(f"quotient of num1 and num2 {num1%num2}")