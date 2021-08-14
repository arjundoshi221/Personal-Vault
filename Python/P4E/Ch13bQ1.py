import json
import urllib.parse
import urllib.request
import urllib.error

while True:
    sum = 0
    url = input('Enter URL: ')
    print('Retriveing ', url)
    fhand = urllib.request.urlopen(url).read()
    data = fhand.decode()
    print('Retrieved', len(data), 'characters')

    try:
        js = json.loads(data)
    except:
        js = None

    '''
    if not js or 'status' not in js or js['status'] != 'OK':
        print("======= ERROR =======")
        continue
    '''
    #print(json.dumps(js, indent=4))

    lst = js['comments']
    for element in lst:
        number = element['count']
        sum += number

    print('Sum:', sum)
    quit()
