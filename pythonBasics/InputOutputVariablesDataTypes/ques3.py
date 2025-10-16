# Take the radius of a circle from the user and calculate the area and circumference.
import math
radius = int(input("Enter radius of circle "))

area = math.pi * radius ** 2
circumference = 2 * math.pi * radius

print(f"Area : {round(area,2)} and Circumference : {round(circumference,2)}")