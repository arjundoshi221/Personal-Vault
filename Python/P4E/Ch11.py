import re

fname = input("Enter file name:")
try:
    fhandle = open(fname)
except:
    print("Could not open file")
    quit()

lst = list()
for line in fhandle:
    number = re.findall('[0-9]+', line)

    if len(number) >= 1:
        for numbers in number:
            lst.append(int(numbers))

T = sum(lst)
print(T)
