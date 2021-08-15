import sqlite3
import re
conn = sqlite3.connect('organizationdb.sqlite')
cur = conn.cursor()

cur.execute('DROP TABLE IF EXISTS Counts')
cur.execute('CREATE TABLE Counts (org TEXT, count INTEGER)')

fname = input('Enter file name: ')
fhand = open(fname)

for line in fhand:
    if not line.startswith('From: '):
        continue
    #all_org = re.findall("@(.+)\s", line)
    #org = all_org[0]
    parts = line.strip().split(' ')
    email = parts[1]
    org = email.split('@')[-1]

    cur.execute('SELECT count FROM Counts WHERE org = ?', (org,))
    row = cur.fetchone()
    if row is None:
        cur.execute('INSERT INTO Counts (org, count) VALUES (?, 1)', (org,))
    else:
        cur.execute(
            'UPDATE Counts SET count = count + 1 WHERE org = ?', (org,))
conn.commit()

sqlcmd = 'SELECT org, count FROM Counts ORDER BY count DESC LIMIT 10'
for row in cur.execute(sqlcmd):
    print(str(row[0]), row[1])

cur.close()
