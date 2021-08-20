# Use the file name mbox-short.txt as the file name
fname = input("Enter file name: ")
try:
    fhandle = open(fname)
    lineCounter = 0
    denominator = 0
    total = 0.0
except:
    print("File could not be opened: ", fname)
for line in fhandle:
    lineCounter += 1
    if not line.startswith("X-DSPAM-Confidence:"):
        continue

    denominator += 1
    spos = line.find('0')
    epos = len(line)
    number = float(line[spos:epos])
    total = number + total

average = (total/denominator)
print("Average spam confidence:", average)

fhandle.close()