from bs4 import BeautifulSoup
import urllib.request
import urllib.parse
import urllib.error
import ssl

# ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

url = input("Enter URL: ")
fhand = urllib.request.urlopen(url).read()
soup = BeautifulSoup(fhand, 'html parser')  # soup is an object that is clean

# retrieve all of the anchor tags (links)
tagsList = soup('a')
for tag in tagsList:
    print(tag.get('href', None))
