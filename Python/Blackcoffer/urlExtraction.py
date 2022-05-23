import requests
from bs4 import BeautifulSoup

url = "https://insights.blackcoffer.com/impacts-of-covid-19-on-vegetable-vendors-and-food-stalls/"
get_url = requests.get(url)
get_text = get_url.text
soup = BeautifulSoup(get_text, "html.parser")
company = soup.find_next('h1', 'class:entry-title')
print(company)
