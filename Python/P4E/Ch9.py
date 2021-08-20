fname = input("Enter file:")
try:
    fhandle = open(fname)
except:
    print("Could not open file: ", fname)
    quit()
emails = list()
counts = dict()
# if len(fname) < 1:
#fname = "mbox-short.txt"
#fhandle = open(fname)

for line in fhandle:
    if not line.startswith('From:'):
        continue
    words = line.split()
    emails.append(words[1])

for email in emails:
    counts[email] = counts.get(email, 0) + 1

    # if email not in counts:
    #counts[email] = 1
    # else:
    #counts[email] = counts[emails] + 1

max_emails = 0
max_address = None

for key in counts:
    if counts[key] > max_emails:
        max_address = key
        max_emails = counts[key]

print(max_address, max_emails)

fhandle.close()
