name = "naman"

print(name[::-1])


# first way

def palindrome(name):
    return name == name[::-1]


ans = palindrome(name)
if ans:
    print("pali")
else:
    print("non pali")

# Second way
list1 = []
list1[:0] = name
list2 = list1.copy()
list2.reverse()
print(list2)
if list1 == list2:
    print("Palindrome ")
else:
    print("non Palindrome")

#Third way

def pali(name):
    rev = ''.join(reversed(name))
    if (name == rev):
        return True
    else:
        return False

s = pali(name)
if s:
    print("palindrome is true")
else:
    print("palindrome is false")

# ---- Number Palindrome
number = 12321
tem= number
r =0
while(number >0):
    num = number%10
    r = r*10+num
    number = number//10

print(r,tem)
if tem == r:
    print("Yes")
else:
    print("no")
