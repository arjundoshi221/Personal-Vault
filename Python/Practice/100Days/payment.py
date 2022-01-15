import random

# Split string method
names_string = input("Give me everybody's names, separated by a comma. ")
names = names_string.split(",")

# n = number of people paying
n = len(names)
print(n)

for i in range(0, n):
    names[i] = names[i].strip()
print(names)

indexPos = random.randint(0, n-1)
print(indexPos)
chosenName = names[indexPos]

print(f"{chosenName} is paying the bill!")
