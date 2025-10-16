# Reverse a list without using reverse().


listEg = [23,4,57,85,66,3,7]
j = len(listEg) -1

for i in range(len(listEg)//2):
    temp = listEg[i]
    listEg[i] = listEg[j]
    listEg[j] = temp
    j=j-1

print("list ",listEg)