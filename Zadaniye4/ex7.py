n = int(input("Введите порядковый номер последнего факториала: "))
def add(x):
    s = 1
    F = 1
    for i in range(2, x + 1):
        F *= i
        s += F
    return s
print("Ответ: ",add(n))