from operator import mul
from functools import reduce 
def add():
    with open('SimvolokovPE_Y-223_vvod(2).txt') as file:
        a = [list(map(int, i.split())) for i in file.readlines()[2:]]
        a_mat = list(zip(*a))
        pr = [reduce(mul, row) for row in a_mat]
        min_p = min(pr)
        index = pr.index(min_p) 
        if index < 3 - 1:
            a_mat[index], a_mat[index + 1] = a_mat[index + 1], a_mat[index]
        else:
            a_mat[index], a_mat[index - 1] = a_mat[index - 1], a_mat[index] 
        a = list(zip(*a_mat)) 
        print(a)
        print()  
    f = open('SimvolokovPE_Y-223_vyvod(2).txt','w')
    f.write(str(a))
    f.close
add()       