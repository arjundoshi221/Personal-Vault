import pandas as pd
ds = pd.DataFrame({'Age': [25, 35, 65, 76, 23, 65],
                   'Name': ['A', 'B', 'C', 'D', 'E', 'F'],
                   'Gender': ['M', 'F', 'M', 'M', 'F', 'M'],
                   'Salary': [25000, 40000, 35000, 65000, 2800, 40000],
                   'Married': ['M', 'U', 'M', 'M', 'U', 'U']})
print(ds)
