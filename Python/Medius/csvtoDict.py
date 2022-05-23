import pandas as pd

dict_from_csv = pd.read_csv(
    "C:/Users/arjd2/OneDrive/Desktop/JOBPROFILE.csv", header=None, index_col=0, squeeze=True).to_dict()

for x, y in dict_from_csv.items():
    print(x, y)
