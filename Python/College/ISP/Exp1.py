def encryption(string, key):
    s = len(string)
    string = string.upper()
    cipher = ''
    for i in range(s):
        if string[i] == " ":
            continue
        x = (ord(string[i])-65)+key
        if x > 25:
            x = x-26
        f = chr(x+65)
        cipher += f
    print(cipher)


def decryption(ciphertext, key):
    s = len(ciphertext)
    ciphertext = ciphertext.upper()
    cipher = ''
    for i in range(s):
        if ciphertext[i] == " ":
            continue
        x = (ord(ciphertext[i])-65)-key
        if x < 0:
            x = x+26
        f = chr(x+65)
        cipher += f
    print(cipher)


def bruteforce(ciphertext, key):

    key = 1
    while True:
        cipher = ''
        for char in ciphertext:
            if char == ' ':
                cipher += char
            elif char.isupper():
                cipher += chr((ord(char) - key - 65) % 26 + 65)
            else:
                cipher += chr((ord(char) - key - 97) % 26 + 97)
        print(cipher)
        key += 1
        if key == 26:
            break


def choice():
    n = int(input("enter your choice: "))
    if n == 1:
        print("Encryption")
        text = input("ENTER THE WORD TO BE ENCRYPTED : ")
        key_val = int(input("ENTER THE KEY : "))
        encryption(text, key_val)
    elif n == 2:
        print("Decryption")
        cipher = input("ENTER THE WORD TO BE DECRYPTED : ")
        key_val = int(input("ENTER THE KEY : "))
        decryption(cipher, key_val)
    elif n == 3:
        print("Brute Force")
        cipher = input("ENTER THE WORD FOR BRUTE FORCE : ")
        key_val = int(input("ENTER THE KEY : "))
        bruteforce(cipher, key_val)
    else:
        choice()


print("1 for Encryption")
print("2 for Decryption")
print("3 for Brute force")
choice()
