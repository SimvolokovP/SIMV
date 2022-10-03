a = int(input("Введите переменную A(при этом A<=B): "))
b = int(input("Введите переменную B(при этом A<=B) "))
def add(x,y):
    if x > y:
        print("Некорректные значения")
    else:    
        for i in range(x, y+1):
            print (i)
add(a, b)