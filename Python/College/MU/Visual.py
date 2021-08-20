import pandas as pd
from matplotlib import pyplot as plt

air = pd.read_csv(
    r"C:\Users\arjd2\Google Drive\Arjun 2\Coding Files-Arjun\Computer Science\Python\College\MU\airquality.csv")
print(air.head())

mpg = pd.read_csv(
    r"C:\Users\arjd2\Google Drive\Arjun 2\Coding Files-Arjun\Computer Science\Python\College\MU\mpg.csv")
plt.scatter(mpg.displ, mpg.hwy)
plt.xlabel("DISPLACEMENT")
plt.ylabel("HWY")
plt.show()
