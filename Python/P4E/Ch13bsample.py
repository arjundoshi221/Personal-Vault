import json
import urllib.parse
import urllib.request
import urllib.error

serviceurl = ''

while True:
    address = input("Enter location: ")

    url = serviceurl + urllib.parse.urlencode({'address': address})
    print('Retriveing ', url)
    fhand = urllib.request.urlopen(url).read()
    data = fhand.decode()
    print('Retrieved', len(data), 'characters')

    try:
        js = json.loads(data)
    except:
        js = None

    if not js or 'status' not in js or js['status'] != 'OK':
        print("======= ERROR =======")
        print(data)
        continue

    print(json.dumps(js, indent=4))
