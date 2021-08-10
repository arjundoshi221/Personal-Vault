

# 1)
# *
# **
# ***
# ****


def pattern1(n):
    for i in range(0, n):
        for j in range(0, i+1):
            print("*", end="")
        print()


# 2)
# 1
# 2 3
# 4 5 6
# 7 8 9 10

def pattern2(n):
    counter = 1
    for i in range(0, n):
        for j in range(0, i+1):
            print(str(counter) + " ", end="")
            counter += 1
        print()

# 3)
#    1
#   2 3
#  4 5 6
# 7 8 9 10


def pattern3(n):
    counter = 1
    for i in range(0, n):

        for k in range(n, i-1, -1):
            print(" ", end="")
        for j in range(0, i+1):
            print(str(counter)+" ", end="")
            counter += 1
        print()


'''
4)
     *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *

'''

# def pattern4(n):


def main():
    n = input("Enter number of rows: ")
    n = int(n)
    pattern3(n)


main()
