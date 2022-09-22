a = 12
b = 3
print(a + b)
print(a - b)
print(a * b)
print(a / b)  # 4.0 (for me 4 is given)
print(a // b)  # 4 ,rounded down towards minus infinity
print(a % b)

for i in range(1, a // b):
    print(i)

a = "yashika"
print(a[5])

parrot = "Norwegian Blue"
print(parrot[3])
print(parrot[4])
print(" ")
print(parrot[3])
print(parrot[6])
print(parrot[8])
print(parrot[0:6])
print(parrot[-2])
print(parrot[0:])
print(parrot[:11] + parrot[0:6])
print(parrot[:])
print(parrot[-4:12])
print(parrot[-6:13])

print(parrot[0:6:3])

number = "1,234,567;456:357;789"
seperator = number[1::4]
print(seperator)

values = "".join(char if char not in seperator else " " for char in number).split()
print([int(val) for val in values])

letters = "abcdefghijklmnopqrstuvwxyz"
print(letters[25:0:-1])
print(letters[::-1])  # its reverse the string

print(letters[16:13:-1])  # print qpo
print(letters[4::-1])  # edcba
print(letters[-8::1])  # last 8 character in not reversed order
print(letters[:-9:-1])  # last 8 character in reversed order

# ex=""
# print (ex[:1])
# print (ex[0])

print("he's" "good")  # works without +

today = "friday"
print("fri" in today)  # true
print("err" in today)  # false
