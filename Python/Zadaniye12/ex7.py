#7
a = int(input("Введите первое число: "))
b = int(input("Введите второе число: "))
def add(a,b):
    if a < b:
        add(a, b - 1)
        print(b)
    elif a > b:
        print(a)
        add(a - 1, b)
    else:
        print(a)    
add(a,b)            