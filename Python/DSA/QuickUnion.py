from QuickFind import process_line
import numpy as np


class QuWTG:
    def __init__(self, NoOfObjs):
        self.data = np.arange(start=0, stop=NoOfObjs, dtype=np.int)
        self.NoOfObjs = NoOfObjs
        self.Ops = 0

    def _root_(self, p):
        while p != self.data[p]:
            p = self.data[p]
        return p

    def Union(self, p, q):
        i = self._root_(p)
        j = self._root_(q)
        self.data[i] = j
        self.Ops += 1

    def Find(self, p, q):
        if(type(p) != int or type(q) != int):
            print("Input must be integer")
        else:
            i = self.root(p)
            j = self.root(q)
            if(i == j):
                return
            if(self.sz[i] < self.sz[j]):
                self.id_array[i] = j
                self.sz[j] += self.sz[i]
            else:
                self.id_array[j] = i
                self.sz[i] += self.sz[j]
