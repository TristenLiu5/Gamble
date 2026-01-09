import random

slot = ["", "", ""]
slotValue = ["🍒", "🍋", "🍇"]

def slots():
    imp = True
    userInput = input("      ")
    while imp == True:
        i = 0
        add = 1
    
        if userInput == "stop":
            add += 1
            i = 1 + add
    
        for i in range(3):
            slotRandom = random.randint(1, 3)
        
            slot[i] = slotValue[slotRandom]

        print("[" + slot[0][0] + " ][" + slot[1][0] + " ][" + slot[2][0] + " ]         ")