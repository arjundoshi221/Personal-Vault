#SHELL

import numpy as np
import time
#import random


def shellSort(array, n):

    interval = n // 2
    while interval > 0:
        for i in range(interval, n):
            temp = array[i]
            j = i
            while j >= interval and array[j - interval] > temp:
                array[j] = array[j - interval]
                j -= interval

            array[j] = temp
        interval //= 2

size=int(input('Enter size of array'))
data=np.random.randint(1,100000,size) 
size = len(data)
start = time.time()
shellSort(data, size)
#print('Sorted Array in Ascending Order:')
#print(data)
print("Time taken is :", (time.time() - start))