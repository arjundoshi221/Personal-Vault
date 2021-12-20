import numpy as np

class quickunion:
	def __init__(self, n):
		self.n=n
		self.data=np.arange(start=0, stop=self.n, dtype=int)
		self.ops=0
		self.sz=np.ones(self.n, dtype=int)
		
	def _root_(self, p):
		while p!=self.data[p]:
			p=self.data[p]
		return p

	def Union(self, p, q):
		i=self._root_(p)
		j=self._root_(q)
		if i==j:
			return
		if self.sz[i]<self.sz[j]:
			self.data[i]=j
			self.sz[j]+=self.sz[i]
		else:
			self.data[j]=i
			self.sz[i]+=self.sz[j]


		self.ops+=1


	def Find(self,p,q):
		return self._root_(p)==self._root_(q)