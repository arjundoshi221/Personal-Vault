import QuickFind as qf
import QuickUnion as qu
import time as tm
import random
import numpy as np
import quickunion_weighted as qw


class Board:
    def __init__(self, brdsize):
        self.boardsize = brdsize
        self.sq = qw.quickunion(brdsize*brdsize + 2)
        self.OpenClose = np.zeros(brdsize*brdsize + 2, dtype=np.int)
        self.OpenClose[0] = 1
        self.OpenClose[brdsize*brdsize+1] = 1
        self.NoOfSqOpened = 0

    def Connect(self, p, q):
        if self.OpenClose[p] and self.OpenClose[q]:
            self.sq.Union(p, q)

    def OpenOneSquare(self, n):
        if self.OpenClose[n]:
            return
        self.OpenClose[n] = 1
        self.NoOfSqOpened += 1
        if n == 1:
            self.Connect(n, 0)
            self.Connect(n, n+1)
            self.Connect(n, n+self.boardsize)
        elif n == self.boardsize*self.boardsize:
            self.Connect(n, self.boardsize*self.boardsize+1)
            self.Connect(n, n-1)
            self.Connect(n, n - self.boardsize)
        elif n == self.boardsize:
            self.Connect(n, 0)
            self.Connect(n, n-1)
            self.Connect(n, n+self.boardsize)
        elif n == self.boardsize * (self.boardsize-1) + 1:
            self.Connect(n, self.boardsize*self.boardsize+1)
            self.Connect(n, n+1)
            self.Connect(n, n - self.boardsize)
        elif n < self.boardsize:
            self.Connect(n, 0)
            self.Connect(n, n - 1)
            self.Connect(n, n + 1)
            self.Connect(n, n + self.boardsize)
        elif n > self.boardsize * (self.boardsize-1):
            self.Connect(n, self.boardsize*self.boardsize+1)
            self.Connect(n, n - 1)
            self.Connect(n, n + 1)
            self.Connect(n, n - self.boardsize)
        elif n % self.boardsize == 0:
            self.Connect(n, n - 1)
            self.Connect(n, n - self.boardsize)
            self.Connect(n, n + self.boardsize)
        elif n % self.boardsize == 1:
            self.Connect(n, n + 1)
            self.Connect(n, n - self.boardsize)
            self.Connect(n, n + self.boardsize)
        else:
            self.Connect(n, n + 1)
            self.Connect(n, n - 1)
            self.Connect(n, n + self.boardsize)
            self.Connect(n, n - self.boardsize)


allreadygeneratedno = []


def UniqueRandomInt(start, stop):
    n = random.randint(start, stop)
    if not n in allreadygeneratedno:
        allreadygeneratedno.append(n)
        return n
    else:
        return UniqueRandomInt(start, stop)


inp = int(input('Enter board size: '))

start = tm.time()

brd = Board(inp)
for i in range(inp*inp):
    n = UniqueRandomInt(1, inp*inp)
    brd.OpenOneSquare(n)
    if brd.sq.Find(0, inp*inp+1):
        print('Board is connected from top to bottom!!!')
        print('No of sq we need to open: ', brd.NoOfSqOpened,
              'Prob: ', brd.NoOfSqOpened/(inp*inp))
        print('No of objs: ', inp*inp, )
        print('Time Taken: ', tm.time()-start)
        break
