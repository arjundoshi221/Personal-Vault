n = 211  # q
g = 103  # alpha

x = input("Enter value of x: ")  # Private Key of Alice
y = input("Enter value of y: ")  # Private Key of Bob
x = int(x)
y = int(y)

#x & y < n
# x = 55  # Private Key of Alice
A = (g ^ x) % n  # Public Key of Alice

# y = 65  # Private Key of Bob
B = (g ^ y) % n  # Public Key of Bob

K1 = (B ^ x) % n  # Key calcuated by Alice using Bobs public Key
K2 = (A ^ y) % n  # Key calcuated by Bob using Alices public Key

print(f"Values of two Keys: K1:{K1}, K2:{K2}")
