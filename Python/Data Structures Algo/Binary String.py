n = 1
s = str(input("Binary number: "))
for i in range(len(s)):
    x = int(s[i])
    rem = n % 3
    if i+1 < len(s):
        x = int(s[i+1])
    n = rem*2 + x
if rem == 0:
    print("Given binary number is divisible by 3")
else:
    print("Given binary number is not divisible by 3, remainder is ", rem)
