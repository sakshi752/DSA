def minimumNumber(arr):
    min = arr[0]
    for i in range(0,len(arr)):
        if arr[i]<min:
            min = arr[i]
    return min

li = [19,124,9,23,5,3]
print(f"minimum number in list is {minimumNumber(li)}")