# Remove duplicates from a list.


listEg = [1, 2, 3, 2, 4, 5, 3, 1, 6]

unique_vals = []

for val in listEg:
    if val not in unique_vals:
        unique_vals.append(val)
    
print("original list ",listEg)
print("without duplicates ",unique_vals)