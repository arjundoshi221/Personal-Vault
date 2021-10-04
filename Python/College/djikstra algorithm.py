
class Stack:
    def __init__(self):
        self.stack = []         # list (empty)
        self.n = 0              # number of elements in the stack
        
    def push(self, a):
        self.stack.append(a)
        self.n += 1
        
    def empty(self):
        return self.n == 0
        
    def pop(self):
        if self.empty():
            raise Exception("empty stack")
        else:
            a = self.stack[-1]              # take the last element
            self.stack = self.stack[:-1]    # take all teh elements from the list except last one and make it new stack
            self.n -= 1
            return a

class queue(Stack):
    def pop(self):
        if self.empty():
            raise Exception("empty queue")
        else:
            a = self.stack[0]              # take the last element
            self.stack = self.stack[1:]    # take all teh elements from the list except last one and make it new stack
            self.n -= 1
            return a

inp = input('Enter an integer: ')
tokens = inp.split()

valstack = Stack()          #just created an empty values stack    
opstack = Stack()           # new operators stack

for tok in tokens:
    if tok == '(': pass         # do nothing  if token is left bracket      
    elif tok == ')':            # pop op from opstack, pop twice from val stack (one is right operand and one is left operand)
        r = valstack.pop()      # do the arithmatic and push the resulr back to value stack
        l = valstack.pop()
        op = opstack.pop()
        if op == '+': valstack.push(l + r)
        if op == '-': valstack.push(l - r)
        if op == '*': valstack.push(l * r)
        if op == '/': valstack.push(l / r)
    elif tok in ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']: valstack.push(int(tok))
    elif tok in ['+', '-', '*', '/']: opstack.push(tok)
    elif tok == '=': print(valstack.pop())
    
'''    
myQueue = queue()
myQueue.push(100)
myQueue.push(50)
myQueue.push(150)

print(myQueue.pop())
print(myQueue.pop())
print(myQueue.pop())
try:
    print(myQueue.pop())
except: print('Error: Queue is alredy empty!!')
'''