import pandas as pd
import numpy as np
import seaborn as sns
import matplotlib.pyplot as plt

import webbrowser
from selenium import webdriver
import urllib
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait
from selenium.webdriver.chrome.options import Options
from tqdm import notebook
import time


def element_presence(by, xpath, time):
    element_present = EC.presence_of_element_located((By.XPATH, xpath))
    WebDriverWait(driver, time).until(element_present)


def send_message(url):
    driver.get(url)
    time.sleep(2)
    element_presence(
        By.XPATH, '//*[@id="main"]/footer/div[1]/div[2]/div/div[1]/div/div[2]', 40)
    msg_box = driver.find_element(
        By.XPATH, '//*[@id="main"]/footer/div[1]/div[2]/div/div[1]/div/div[2]')
    msg_box.send_keys('\n')
    time.sleep(1)c
