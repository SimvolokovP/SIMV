#Вариант-11(2)
from operator import mul
from functools import reduce 
n = int(input("Длина массива: ")) 
a = []
for i in range(n):
    b = []
    for i in range(n):
         b.append(int(input()))
    a.append(b)  
for i in range(n):
        for j in range(n):
            print(a[i][j],end=' ')
        print()       
a_mat = list(zip(*a))
pr = [reduce(mul, row) for row in a_mat]
min_p = min(pr)
index = pr.index(min_p) 
if index < n - 1:
    a_mat[index], a_mat[index + 1] = a_mat[index + 1], a_mat[index]
else:
    a_mat[index], a_mat[index - 1] = a_mat[index - 1], a_mat[index] 
a = list(zip(*a_mat))    
print('------')
for i in range(n):
        for j in range(n):
            print(a[i][j],end=' ')
        print()  