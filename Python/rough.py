from sympy import isprime
import math


def key_maker(p, q):
    n = p * q
    phi = (p - 1) * (q - 1)

    e = int(input())
    while e_gcd(e, phi) == False:
        print("Not relative prime")
        e = int(input())

    d = 1
    while True:
        if (e * d % phi) == 1:
            break
        d += 1

    # print(n, phi, e, d)

    return [e, n], [d, n]


def e_gcd(e, phi):
    if math.gcd(e, phi) == 1:
        return True
    else:
        return False


def encryption(pt, e, n):
    li = list(pt)
    num = []
    for i in range(len(li)):
        a = ord(li[i]) - 65
        num.append(a)
    encrypted = []
    for m in num:
        encrypted.append(m ** e % n)

    return encrypted


def decryption(ct, d, n):
    decrypted = []
    for c in ct:
        decrypted.append(c ** d % n)
    pt = ""
    for i in decrypted:
        a = chr(i + 65)
        pt += a

    return pt


p, q = map(int, input().split())
while isprime(p) == False or isprime(q) == False:
    print("Not prime")
    p, q = map(int, input().split())

publick, privatek = key_maker(p, q)
# print(publick, privatek)

print("1: encryption 2: decryption")
ch = int(input())

if ch == 1:
    pt = input("In Caps please\n")
    encrypt = encryption(pt, *publick)
    print(*encrypt)

elif ch == 2:
    ct = list(map(int, input().split()))
    decrypt = decryption(ct, *privatek)
    print(decrypt)
