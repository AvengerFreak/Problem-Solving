import random
computer_choices = ['rock', 'paper', 'scissors'] # global variable

def game():

    human_choice = input("Enter choice here: ")
    computer_choice = random.choice(computer_choices)

    print("Human chose " + human_choice)
    print("Computer chose " + computer_choice)

    if computer_choice == "rock":

        if human_choice == "rock":
            print("It's a tie.")

        elif human_choice == "paper":
            print("You win!")

        else:
            print("You lose.")
        

    elif computer_choice == "paper":

        if human_choice == "paper":
            print("It's a tie.")

        elif human_choice == "scissors":
            print("You win!")

        else:
            print("You lose.")
        

    else:

        if human_choice == "scissors":
            print("It's a tie.")

        elif human_choice == "rock":
            print("You win!")

        else:
            print("You lose.")
        

def __init__():

    play = True

    while play:

        game()
        playAgain = input("Would you like to play again? (Yes or no): ")

        if playAgain == "yes" or playAgain == "Yes" or playAgain == "Y" or playAgain == "y":
            play = True

        else:
            play = False

__init__()