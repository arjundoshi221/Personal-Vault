fname = input("Enter file name: ")
try:
    fhandle = open(fname)
except:
    print("File could not be opened:", fname)
    quit()
for line in fhandle:
    newLine = line.rstrip()
    print(newLine.upper())

fhandle.close()
