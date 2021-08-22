import numpy as np
#QuickFind
#Riddhi Parakh J073,J3

class QuickFind:
    def __init__(self, NoOfObjs = 10):
        self.data = np.arange(NoOfObjs, dtype=np.int)   
        self.size = NoOfObjs

    def Union(self, p, q):          
        if not self.Find(p, q):
            tmp = self.data[p]
            for i in range(self.size):
                if self.data[i] == tmp:
                    self.data[i] = self.data[q]

    def Find(self, p, q):           
        return self.data[p] == self.data[q]             

def process_line(str):
    command, params = str.split('(')            
    a, b = params.strip().split(',')                
    p = int(a)                                      
    q = int(b.strip().split(')')[0].strip())                                 
    return command, p, q

hfile = open('/Users/riddhiparakh/Desktop/inputqf.txt')
if not hfile:
    print('input file not found!')
    exit()

n = int(hfile.readline().strip())    
myobj = QuickFind(n)

inpstr = hfile.readline().strip()
while inpstr:
    command, p, q = process_line(inpstr)
    if command.strip() == 'Union':
        myobj.Union(p, q)
    if command.strip() == 'Find':
        print('Are p: ', p, ' and q: ', q, ' connected?: ', myobj.Find(p, q))
    inpstr = hfile.readline().strip()

  