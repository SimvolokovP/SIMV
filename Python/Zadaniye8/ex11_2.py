#Вариант-11(2)
A = []
B = []
x = int(input('Введите длину строки матрицы: '))
y = int(input("Введите кол-во строк матрицы: "))
for i in range(x):
    A1 = []
    for i in range(y):
        A1.append(int(input()))
    A.append(A1)
for i in range(x):
    B1 = []
    for i in range(y):
        B1.append(int(input()))
    B.append(B1)  
def add(m,n):
        max_A = A[0][0]
        max_B = B[0][0]
        index_A = (0,0)
        index_B = (0,0)
        for i in range(m):
            for j in range(n):
                if A[i][j] > max_A:
                    max_A = A[i][j]  
                    index_A = (i,j)
        for i in range(m):
            for j in range(n):
                if B[i][j] > max_B:
                    max_B = B[i][j]
                    index_B = (i,j)   
        A[index_A[0]][index_A[1]], B[index_B[0]][index_B[1]] = B[index_B[0]][index_B[1]], A[index_A[0]][index_A[1]]                   
add(x,y)
print("Измененная матрица 1:")
for i in range(x):
    for j in range(y):
        print(A[i][j],end=' ')
    print() 
print("Измененная матрица 2:") 
for i in range(x):
    for j in range(y):
        print(B[i][j],end=' ')
    print()       