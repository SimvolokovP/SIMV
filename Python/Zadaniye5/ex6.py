def add():
    x = int(input("Введите число: "))
    s = 0
    i = 0
    k = 0
    while x != 0:
        i += 1
        s += x
        x = int(input("Введите число: "))
        k = s / i
    return(k)    
print("Среднее значение элементов последовательности равно:",add())