def SearchInRange(arr,start,end,target):
    for i in range(start,end+1):
        if arr[i] == target:
            return i
    return -1

arr = [9,20,35,73,1,43,5,99]
isPresentInRange = SearchInRange(arr,2, 5,73)
if isPresentInRange != -1:
    print(f"present at inde {isPresentInRange}")
else:
    print("not present")