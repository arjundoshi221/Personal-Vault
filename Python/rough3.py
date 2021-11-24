def TowerOfHanoi(n, from_rod, to_rod, aux_rod):
    if n == 1:
        print("Move disk 1 from rod", from_rod, "to rod", to_rod)
        return
    TowerOfHanoi(n-1, from_rod, aux_rod, to_rod)
    print("Move disk", n, "from rod", from_rod, "to rod", to_rod)
    TowerOfHanoi(n-1, aux_rod, to_rod, from_rod)


# Driver code
# A->source, B->temporary, C->destination
n = 4
TowerOfHanoi(n-2, 'A', 'C', 'B')
print("Move disk", n-1, "from rod ", "A", " to rod ", "B")
TowerOfHanoi(n-2, 'C', 'B', 'A')
print("Move disk", n, "from rod ", "A", " to rod ", "C")
TowerOfHanoi(n-1, 'B', 'C', 'A')
