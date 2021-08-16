def factorial(n):
    if (n == 1 or n == 0):
        return 1
    else:
        return (n * factorial(n - 1))


def main():

    n = int(input("Enter number: "))
    if n < 0:
        print("Factorial does not exist for negative numbers")
        quit()
    else:
        factorial(n)
    print("Factorial : ", factorial(n))


main()
