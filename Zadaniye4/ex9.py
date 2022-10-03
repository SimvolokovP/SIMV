n = int(input("Кол-во чисел из ряда Фибоначчи: ")) 
def add(x):
    c = 1
    p = 0
    while (c < x):
        c, p = c+p, c
    return (c+p-1)
print("Сумма чисел равна: ", add(n))    