
import random

computerChoice = random.randint(0, 2)
print("Enter rock, paper or scissors: ")
userInput = int(input("For rock: 1, for paper: 2, for scissors: 3 -- "))
if(userInput > 3 or userInput <= 0):
    print("Invalid number")
    quit()

userChoice = userInput - 1
rock = '''
    _______
---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)
'''

paper = '''
    _______
---'   ____)____
          ______)
          _______)
         _______)
---.__________)
'''

scissors = '''
    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
'''
choices = [rock, paper, scissors]


print("You: \n", choices[userChoice])
print("Computer: \n", choices[computerChoice])

if(computerChoice == userChoice):
    print("Its a draw :)")
elif(userChoice == 0 and computerChoice == 2):
    print("You WIN!")
elif(userChoice == 2 and computerChoice == 0):
    print("You LOSE!")
elif(userChoice > computerChoice):
    print("You WIN!")
elif(userChoice < computerChoice):
    print("You LOSE!")
