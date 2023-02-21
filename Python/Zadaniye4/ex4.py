n = int(input("Введите кол-во слагаемых "))
def add(x):
    s = 0
    for i in range(x):
        s += int(input("Введите число: "))
    return s
print("Ответ: ",add(n))