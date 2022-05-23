# Import modules
from bs4 import BeautifulSoup
import requests

# Assign URL
url = "https://blackcoffer.com/"

# Make a GET request to fetch the raw HTML content
html_content = requests.get(url).text
soup = BeautifulSoup(html_content, "lxml")
print(soup.prettify())
# # Parse the html content using any parser
# soup = BeautifulSoup(html_content, "html.parser")
# for a in ["title"]:
#     print(soup.find_all(a))
# # Display HTML tags
# [print(tag.name) for tag in soup.find_all()]
