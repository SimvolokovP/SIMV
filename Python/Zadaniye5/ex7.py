def add():
    f = int(input("Введите число: "))
    i = 0
    while f != 0:
        s = int(input("Введите число: "))
        if s != 0 and f < s:
            i += 1
        f = s
    return i    
print("Элементов этой последовательности больше предыдущего элемента:",add())           