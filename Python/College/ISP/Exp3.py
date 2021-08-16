q = 11    # Prime Number Selected
alpha = 2  # Primitive root of q

#Xa & Xb < q
Xa = 10  # Private Key of Alice
Xb = 5  # Private Key of Bob

Ya = (alpha ^ Xa) % q  # Public Key of Alice
Yb = (alpha ^ Xb) % q  # Public Key of Bob

K1 = (Yb ^ Xa) % q
K2 = (Ya ^ Xb) % q

print(f"Values of two Keys: K1:{K1}, K2:{K2}")
