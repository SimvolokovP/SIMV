def add():
    len = 1
    len_max = 1
    x = y = 1
    i = 1
    while x != 0:
        x = int(input("Введите число: "))
        if y == x:
            len += 1
        else:
            if len > len_max:
                len_max = len
            len = 1
        y = x
        i += 1
    return(len_max)
print("Наибольшее число подряд идущих элементов этой последовательности, равных друг другу:", add())    