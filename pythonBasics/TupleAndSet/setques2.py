# Check if two sets are disjoint.
set1 = {1, 2, 3}
set2 = {4, 5, 6}
# set2 = {4, 5, 6,1}

if set1.isdisjoint(set2):
    print("Sets are disjoint")
else:
    print("Sets are not disjoint")