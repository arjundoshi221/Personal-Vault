import math

print("Welcome to the tip calculator.")

bill_amount = float(input("What was the total amount? "))
number_of_people = int(input("How many people to split the bill? "))
tip_percentage = int(
    input("What percentage of tip would you like to pay? \n10%, 12% or 15%"))

tip_amount = None
if(tip_percentage == 10):
    tip_amount = ((0.1*bill_amount)+bill_amount)/number_of_people
elif(tip_percentage == 12):
    tip_amount = ((0.12*bill_amount)+bill_amount)/number_of_people
elif(tip_percentage == 15):
    tip_amount = ((0.15*bill_amount)+bill_amount)/number_of_people
else:
    print("please enter tip amount")

print("Each person should pay: ", round(tip_amount, 1))
