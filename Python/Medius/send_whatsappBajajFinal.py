import pywhatkit as w
import pyautogui
import keyboard as k
import time
from pynput.mouse import Button, Controller
import pandas as pd
import csv

mouse = Controller()


def whatmsg(phone, name):
    year, month, day, hour, min = map(
        int, time.strftime("%Y %m %d %H %M").split())
    print(hour, min)
    if min == 58:
        hour = hour + 1
        min = 0
    w.sendwhatmsg(phone, f"You have failed to respond to the served legal notice.Please be advised that avoiding legal notices has legal consequences.\n\nOur lawyers can be reached at 8169409649 or 7385120445 to discuss the settlement offer.\n\nPlease get in touch with us by today or tomorrow. No settlement requests will be entertained after the stipulated period.\n\n*This will be your last opportunity to settle and close the Bajaj Loan*\n\nKS Legal",
                  hour, min+1, 15)
    time.sleep(5)
    mouse.position = (683, 384)
    mouse.move = (5, -5)
    mouse.press(Button.left)
    mouse.release(Button.left)
    k.press_and_release('enter')
    time.sleep(2)
    k.press_and_release('ctrl+w')


# Opening the CSV (Of the applicants/raw data)
dict_from_csv = pd.read_csv(
    "C:/Users/arjd2/OneDrive/Desktop/whatsappmessage.csv", header=None, index_col=0, squeeze=True).to_dict()

# Counter/country code to check for successful sends
c = 0
countrycode = "+91"

# WhatsappSending function
for phone, name in dict_from_csv.items():
    c = c+1
    print(c)
    phone1 = countrycode + str(phone)
    name1 = str(name)

    whatmsg(phone1, name1)
