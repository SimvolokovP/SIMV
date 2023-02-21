#Вариант12(2)
def add():
    a = []
    b = []
    for i in range(10):
        print("Введите",i,"элемент массива 1: ")
        a.append(int(input()))
    for i in range(10):
        print("Введите",i,"элемент массива 2")
        b.append(int(input()))
    a, b = b, a
    print("Преобразованный массив 1:",a)
    print("Преобразованный массив 2:",b)
add()            