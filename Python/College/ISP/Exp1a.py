word = input('Enter word : ')
key = int(input('Enter key : '))

encrypt = ' '
for char in word:
    if char == ' ':
        encrypt += char
    elif char.isupper():
        encrypt += chr((ord(char) + key - 65) % 26 + 65)
    else:
        encrypt += chr((ord(char) + key - 97) % 26 + 97)

print(encrypt)
