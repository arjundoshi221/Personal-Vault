fname = input("Enter file name: ")
emails = list()
try:
    fhandle = open(fname, 'r')
except:
    print("File could not be opened")
    quit()

counter = 0
for line in fhandle:
    if not line.startswith("From"):
        continue

    linelst = list()
    linelst = line.split(' ')

    if len(linelst) < 3:
        continue

    counter += 1
    # if linelst[1] not in emails:
    emails.append(linelst[1])
    print(linelst[1])
print(
    f"There were {counter} lines in the file with From as the first word", "")

fhandle.close()