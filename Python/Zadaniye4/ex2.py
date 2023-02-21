a = int(input("Введите переменную A: "))
b = int(input("Введите переменную B: "))
def add(x,y):
    if a < b:
        for i in range(x, y + 1):
            print(i)
    else:
        for i in (range(x, y - 1, -1)):
            print(i) 
add(a, b)                  