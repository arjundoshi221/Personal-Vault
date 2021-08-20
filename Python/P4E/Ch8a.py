fname = input("Enter file name: ")
try:
    fhandle = open(fname)
except:
    print("File not found")
    quit()
lst = list()
for line in fhandle:
    words = line.split()
    for word in words:
        if word not in lst:
            lst.append(word)
print(sorted(lst))

fhandle.close()