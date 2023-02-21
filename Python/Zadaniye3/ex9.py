n = int(input("Кол-во долек в длину: "))
m = int(input("Кол-во долек в ширину: "))
k = int(input("Кол-во долек: "))
def add():
    if k < n * m:
        if (k % n == 0) or (k % m == 0):
            print("Да")
        else:
            print("Нет")
    else:
        print("Некорректные значения")  
    return add          
add()            