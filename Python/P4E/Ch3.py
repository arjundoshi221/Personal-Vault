# 3.3 Write a program to prompt for a score between 0.0 and 1.0. If the score is out of range, print an error. If the score is between 0.0 and 1.0, print a grade using the following table:
# Score Grade
# >= 0.9 A
# >= 0.8 B
# >= 0.7 C
# >= 0.6 D
# < 0.6 F
# If the user enters a value out of range, print a suitable error message and exit. For the test, enter a score of 0.85.

score = input("Enter score between 0 and 1:")
try:
    score = float(score)
except:
    print("Please enter numerical values between 1 and 0.")
    quit()
if score >= 0.0 and score <= 1.0:

    if score >= 0.9:
        grade = 'A'
    elif score < 0.9 and score >= 0.8:
        grade = 'B'
    elif score < 0.8 and score >= 0.7:
        grade = 'C'
    elif score < 0.7 and score >= 0.6:
        grade = 'D'
    else:
        grade = 'F'
else:
    print("Please enter numerical values between 1 and 0.")

print(grade)
