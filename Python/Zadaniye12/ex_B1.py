#B1
b = []
def add(a):
    n = int(input("Введите число: "))
    if n == 0:
        return a
    a.append(n)   
    return add(a)
print('Макс. значение последовательности:',max(add(b)))    