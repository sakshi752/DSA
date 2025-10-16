# Take marks and print grade (A, B, C, F)

marks = int(input("Enter your marks : "))

if marks >85:
    print("Grade A")
elif marks >75:
    print("Grade B")
elif marks > 60:
    print("Grade C")
else:
    print("Grade F")