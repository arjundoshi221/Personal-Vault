def Union(self, p, q):
    i = self.root(p)
    j = self.root(q)
    if i == j:
        return
    if self.sz[i] < self.sz[j]:
        self.data[i] = j
        self.sz[j] += self.sz[i]
    else:
        self.data[j] = i
        self.sz[i] += self.sz[j]
    self.NoOfOps += 1


def root(self, p):
    while p != self.data[p]:
        p = self.data[p]
    return p


def Find(self, p, q):
    return self.root(p) == self.root(q)
