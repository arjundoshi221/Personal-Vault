# 5.2 Write a program that repeatedly prompts a user for
# integer numbers until the user enters 'done'.
# Once 'done' is entered, print out the largest and
# smallest of the numbers. If the user enters anything
# other than a valid number catch it with a try/except
# and put out an appropriate message and ignore the number.
# Enter 7, 2, bob, 10, and 4 and match the output below.

l = None
s = None
while True:
    number = input("Enter number: ")
    if number == 'done':
        break
    try:
        number = int(number)

        if l is None:
            l = number
        elif l < number:
            l = number

        if s is None:
            s = number
        elif s > number:
            s = number
    except:
        print("Invalid input.")
        continue

print("Maximum is ", l)
print("Minimum is ", s)
