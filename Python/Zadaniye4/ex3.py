a = int(input("Введите переменную A(при это A>B): "))
b = int(input("Введите переменную B(при это A>B): "))
def add(x, y):
    if a > b:
        for i in range(x - (x + 1) % 2, y - y % 2, -2):
            print(i, end=' ')
    else:
        print("Некорректные значения")                
add(a, b)                    