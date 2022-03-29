def primeNo():
    spos = int(input("Enter number to start from: "))
    epos = int(input("Enter number to end with: "))

    factors = [1]
    primeNo = list()

    if(spos == 1):
        primeNo.append(2)

    if(spos % 2 == 0):
        spos = spos + 1
        factors.append(2)

    for i in range(spos, epos+1, 2):
        for j in range(3, i+1, 2):
            if(i % j == 0):
                factors.append(j)

        if(len(factors) == 2):
            primeNo.append(i)

        factors = [1]

    print("Prime Numbers:")
    print(primeNo)


primeNo()
