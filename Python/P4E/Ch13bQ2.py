import json
import urllib.parse
import urllib.request
import urllib.error
import ssl

# If you have a Google Places API key, enter it here
# api_key = 'AIzaSy___IDByT70'
# https://developers.google.com/maps/documentation/geocoding/intro
api_key = 42
serviceurl = 'http://py4e-data.dr-chuck.net/json?'

# Ignore SSL certificate errors
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

while True:
    # Taking location
    address = input("Enter location: ")

    # Setting up the GET parameters on the URL
    parameters = dict()
    parameters['address'] = address
    parameters['key'] = api_key
    parametersURL = urllib.parse.urlencode(parameters)

    # Generating the complete URL.
    url = serviceurl.strip() + parametersURL.strip()
    print('Retriveing ', url)

    # Opening entire URL and printing it
    fhand = urllib.request.urlopen(url).read()
    data = fhand.decode()
    print('Retrieved', len(data), 'characters')

    try:
        # obtaining the data in readable format
        jsondata = json.loads(data)
    except:
        jsondata = None

    # checking the returned json file
    if not jsondata or 'status' not in jsondata or jsondata['status'] != 'OK':
        print("======= ERROR =======")
        print(jsondata)
        continue

    # displaying the readable data
    print(json.dumps(jsondata, indent=4))

    # parsing through the file
    place_id = jsondata["results"][0]["place_id"]
    print('Place ID', place_id)
