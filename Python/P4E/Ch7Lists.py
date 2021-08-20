# Use the file name mbox-short.txt as the file name
fname = input("Enter file name: ")
numlist = list()
try:
    fhandle = open(fname)
    lineCounter = 0
except:
    print("File could not be opened: ", fname)
for line in fhandle:
    lineCounter += 1
    if not line.startswith("X-DSPAM-Confidence:"):
        continue

    spos = line.find('0')
    epos = len(line)
    number = float(line[spos:epos])
    numlist.append(number)

average = sum(numlist)/len(numlist)
print("Average spam confidence:", average)

fhandle.close()