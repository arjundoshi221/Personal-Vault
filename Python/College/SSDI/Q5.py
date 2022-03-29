import pandas as pd

pd_series = pd.Series(data=[1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 3])

print("Pandas Series:")
print(pd_series)
print("Mean:")
print(pd_series.mean())
print("Standard deviation:")
print(pd_series.std())
