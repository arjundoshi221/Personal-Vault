import urllib.request
from bs4 import BeautifulSoup
import ssl

namesList = list()


def WebScraper(url, spos):
    index = spos
    ctx = ssl.create_default_context()
    ctx.check_hostname = False
    ctx.verify_mode = ssl.CERT_NONE

    fhand = urllib.request.urlopen(url).read()
    soup = BeautifulSoup(fhand, 'html.parser')

    tagsList = soup('a')
    for tag in tagsList[:index]:
        input = str(tag.get('href', None))
        if len(input) > 1:
            linkCopy = input
            tmp = list()
            s1 = input.split('_')
            indexPos = len(s1[2])-5
            name = s1[2][:indexPos]
            tmp.append(name)

    namesList.append(tmp[-1])
    return linkCopy


def main():
    url = input("Enter URL: ")
    spos = int(input("Enter position of 1st Link:"))
    reps = int(input("Enter number of repititions: "))

    for i in range(reps):
        url = WebScraper(url, spos)

    print(namesList)


main()
