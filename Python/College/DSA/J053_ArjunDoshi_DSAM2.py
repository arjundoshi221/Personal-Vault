import numpy as np
import time


class section1_1:
    def __init__(self, cap=5):
        self.stack = np.empty(cap, dtype=np.chararray)
        self.N = 0

    def push(self, item):
        if self.N == len(self.stack):
            self._resize_((len(self.stack))*2)

        self.stack[self.N] = item
        self.N += 1

    def pop(self):
        item = None
        if not self.isEmpty():
            item = self.stack[self.N-1]
            self.stack[self.N-1] = None
            self.N -= 1

        if self.N < len(self.stack)//2:
            self._resize_((len(self.stack))//2)

        return item

    def _resize_(self, n):
        copy = np.empty(n, dtype=np.chararray)

        for i in range(self.N):
            copy[i] = self.stack[i]
        self.stack = copy

    def isEmpty(self):
        return self.N < 0


class section1_2:
    def __init__(self, cap=5):
        self.stack = np.empty(cap, dtype=np.chararray)
        self.N = 0

    def push(self, item):
        if self.N == len(self.stack):
            self._resize_((len(self.stack))*2)

        self.stack[self.N] = item
        self.N += 1

    def pop(self):
        item = None
        if not self.isEmpty():
            item = self.stack[self.N-1]
            self.stack[self.N-1] = None
            self.N -= 1

        if self.N < len(self.stack)//4:
            self._resize_((len(self.stack))//2)

        return item

    def _resize_(self, n):
        copy = np.empty(n, dtype=np.chararray)

        for i in range(self.N):
            copy[i] = self.stack[i]
        self.stack = copy

    def isEmpty(self):
        return self.N < 0


arr = np.random.random(50000)

s11 = section1_1()
start1 = time.time()
for i in arr:
    s11.push(i)

for i in range(len(arr)):
    s11.pop()

print("Time for Section 1.1 Stack is:", time.time()-start1)

s12 = section1_2()
start2 = time.time()
for i in arr:
    s12.push(i)

for i in range(len(arr)):
    s12.pop()

print("Time taken for Section 1.2 Stack is:", time.time()-start2)
