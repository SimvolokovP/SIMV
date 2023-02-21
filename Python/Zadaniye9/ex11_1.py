#Вариант-11(1)
n = int(input("Введите длину квадратного матрицы: "))
def add(x):
    a = []
    for i in range(x):
        b = []
        for i in range(x):
            b.append(int(input()))
        a.append(b)
    for i in range(x):
        for j in range(x):
            print(a[i][j],end=' ')
        print()       
    minimum = [min(i) for i in a]
    min_s = minimum.index(min(minimum))    
    print("Номер строки, содержащей минимальный элемент:",min_s+1) 
    summa = sum(a[min_s])
    print("Сумма элементов строки с наименьшим значением:",summa)
add(n)   