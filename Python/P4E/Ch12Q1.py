# Input http://py4e-data.dr-chuck.net/comments_1239780.html
#Ans: 2306
from bs4 import BeautifulSoup
import urllib.request
import ssl
import re

# ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

url = input("Enter URL: ")
fhand = urllib.request.urlopen(url).read()
soup = BeautifulSoup(fhand, 'html.parser')  # soup is an object that is clean

sum = 0
# retrieve all of the anchor tags
tags = soup('span')
for tag in tags:
    input = str(tag)
    numberList = re.findall("[0-9]+", input)
    for n in numberList:
        n = int(n)
        sum = sum + n
print(sum)
