def GCD(m, n):
    gcd = 1
    small = min(m, n)

    for i in range(1, small+1):
        if((m % i == 0) and (n % i == 0)):
            gcd = i

    return gcd


def Euclidean(m, n):
    # assume m>=n
    gcd = 1
    if m < n:
        (m, n) = (n, m)

    # m = qn + r
    # r = m%n
    # m = ad, n=bd
    # ad = q(bd) + r (Since addition sign if lhs/d then rhs/d)
    # this follows that r = cd

    while(n != 0):
        (m, n) = (n, m % n)

    return m

# What is the value of f(3456) for the function below?


def f(x):
    d = 0
    while x >= 1:
        (x, d) = (x/7, d+1)
    return(d)

# What is h(60)-h(45), given the definition of h below?


def h(n):
    s = 0
    for i in range(2, n):
        if n % i == 0:
            s = s+i
    return(s)

# For what value of n would g(375,n) return 4?


def g(m, n):
    res = 0
    while m >= n:
        (res, m) = (res+1, m/n)
    return(res)


def mys(m):
    if m == 1:
        return(1)
    else:
        return(m+mys(m-1))


def main():
    m = int(input("Enter 1st number: "))
    n = int(input("Enter 2nd number: "))

    #number = Euclidean(m, n)
    y = g(m, n)
    x = mys(m)
    #print(f"GCD = {number}")
    print(f"Solution = {x}")


main()
