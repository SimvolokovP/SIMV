#Вариант-11(1)
a = []
n = int(input("Введите длину массива: "))
def add():
    j = 0
    for i in range(n):
        print("Введите",i,"элемент массива: ")
        a.append(int(input()))
    for i in a:
        if i % 2 == 0:
            j = i
    return(j)    
print("Наибольший четный элемент массива:",add())    