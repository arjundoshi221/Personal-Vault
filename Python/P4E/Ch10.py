fname = input("Enter file name: ")
if len(fname) < 1:
    name = "c:/Users/arjd2/OneDrive/Desktop/Arjun 2/Coding Files/Computer Science/Python/P4E/Ch7mbox-short.txt"
try:
    fhandle = open(fname)
except:
    print("File could not be opnened.")
    quit()

hourOfMessage = list()

for line in fhandle:
    if not line.startswith('From'):
        continue

    lst = list()
    time = list()
    hour = list()
    lst = line.split()

    if not len(lst) > 3:
        continue

    time.append(lst[5])

    for times in time:
        hour = times.split(":")

    hourOfMessage.append(hour[0])

counts = dict()

for i in hourOfMessage:
    counts[i] = counts.get(i, 0) + 1
    # if i not in counts:
    #counts[i] = 1
    # else:
    #counts[i] = counts[1] + 1

print(counts)

# Sort by Key
valueKey = sorted(counts.items())
for k, v in valueKey:
    print(k, v)

# Sort by Values
valueSort = list()

'''
#print(sorted([(v,k) for k,v in counts.items()], reverse=True))

#print(sorted([make new tuples (v,k) for (from) k,v in counts.items()], reverse=True))

for k, v in counts.items():
    revtup = (v, k)
    valueSort.append(revtup)

valueSort = sorted(valueSort, reverse=True)


for v, k in valueSort:
    print(k, v)
'''
fhandle.close()
