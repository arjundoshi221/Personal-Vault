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
    w.sendwhatmsg(phone, f"Hello,\n{name} at Medius Technologies Pvt Ltd.\n\nWe are conducting walk-in interviews between 1-6 p.m. on 21st May, Saturday at our Churchgate office.\n\nWe have 50 vacancies so you can share this with others who is looking for a job and ask them to come for the walk-in interview.\n\nAddress - F-21, 7th Floor, Manek Mahal, Next to Ambassador Hotel, Churchgate, Mumbai 400020\n\nRegards,\nHR Team - Medius Technologies \n9028450476",
                  hour, min+1, 15)
    # py

    # autogui.click(x=1280, y=10
    # 80)
    time.sleep(5)
    mouse.position = (1280, 1080)
    mouse.move = (5, -5)
    mouse.press(Button.left)
    mouse.release(Button.left)
    k.press_and_release('enter')


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
