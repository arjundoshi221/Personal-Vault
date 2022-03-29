def EvenOdd():
    N = [10, 12, 89, 63, 87, 56, 57, 83, 45, 78]

    Odd = list()
    OddCount = 0
    Even = list()
    EvenCount = 0

    for i in N:
        if(i % 2 != 0):
            OddCount = OddCount+1
            Odd.append(i)
        else:
            EvenCount = EvenCount + 1
            Even.append(i)

    print(Odd)
    print("Number of Odd numbers = " + str(OddCount))
    print(Even)
    print("Number of Even numbers = " + str(EvenCount))


EvenOdd()
