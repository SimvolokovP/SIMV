#Вариант-12(1)
a = []
b = []
n = int(input("Введите длину массива: "))
def add():
    for i in range(n):
        print("Введите",i,"элемент массива: ")
        a.append(int(input()))
    for i in a:
        if i % 2 != 0:
            b.append(i)
    print("Минимальный нечетный элемент массива:",min(b))
add()           