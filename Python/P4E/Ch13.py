import urllib.request
import xml.etree.ElementTree as ET
import ssl

# ignore SSL Certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

sum = 0
url = input("Enter URL: ")
fhand = urllib.request.urlopen(url).read()
print('Retrieved', len(fhand), 'characters')
# print(fhand.decode())
tree = ET.fromstring(fhand)

comment = tree.findall('.//count')
print("User count: ", len(comment))

for numbers in comment:
    # print(numbers.text)
    sum += int(numbers.text)

print(sum)
