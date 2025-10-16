
def search_char_in_string(str,ch):
    for char in range(0,len(str)):
        if ch == str[char]:
            return char
    return -1

str = "sakshi"
ch = input("Enter a character ")
index = search_char_in_string(str,ch)

if index != -1:
    print(f"index of {ch} is {search_char_in_string(str)} ")
else:
    print("char is not present in string")
