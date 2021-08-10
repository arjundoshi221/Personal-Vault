import urllib.request
import urllib.parse
import urllib.error

fhand = urllib.request.urlopen('http://data.pr4e.org/intro-short.txt')
for line in fhand:
    print(line.decode().strip())

print("Hello big world")
