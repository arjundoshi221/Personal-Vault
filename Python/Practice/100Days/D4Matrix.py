matrix = [["⬜️", "⬜️", "⬜️"], ["⬜️", "⬜️", "⬜️"], ["⬜️", "⬜️", "⬜️"]]

for i in range(0, 3):
    for j in range(0, 3):
        print(matrix[i][j], end=" ")
    print("\n")

n = int(input("Where do you want to place treasure?: "))

row = n % 10
n = n//10
col = n % 10

print("row=", row)
print("col", col)

matrix[row-1][col-1] = "🚨"
for i in range(0, 3):
    for j in range(0, 3):
        print(matrix[i][j], end=" ")
    print("\n")
