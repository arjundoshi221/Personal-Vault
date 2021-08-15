import sqlite3
conn = sqlite3.connect('emaildb.sqlite')
cur = conn.cursor()

cur.execute('DROP TABLE IF EXISTS Counts')
cur.execute('CREATE TABLE Counts (email TEXT, count INTEGER)')

fname = input('Enter file name: ')
fhand = open(fname)

for line in fhand:
    if not line.startswith('From: '):
        continue
    pieces = line.split()
    email = pieces[1]

    cur.execute('SELECT count FROM Counts WHERE email = ?', (email,))
    row = cur.fetchone()
    if row is None:
        cur.execute('INSERT INTO Counts (email, count) VALUES (?, 1)', (email,))
    else:
        cur.execute(
            'UPDATE Counts SET count = count + 1 WHERE email = ?', (email,))
    conn.commit()

sqlcmd = 'SELECT email, count FROM Counts ORDER BY count DESC LIMIT 10'
for row in cur.execute(sqlcmd):
    print(str(row[0]), str(row[1]))

cur.close()
