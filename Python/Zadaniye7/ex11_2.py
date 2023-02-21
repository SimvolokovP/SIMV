#Вариант-11(2)
a = []
b = []
n = int(input("Введите длину массива: "))
def add():
    for i in range(n):
        print("Введите",i,"элемент массива: ")
        a.append(int(input()))
    for i in a:
        if i % 2 == 0 and i < 10:
            b.append(i)                
    if len(b) == 0:
        print("Таких чисел нет!")
    else:
        print("Полученный массив:",sorted(b))        
add()