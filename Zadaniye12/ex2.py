#2
def add(a,b):
    if a >= b:
        return add(a-b,b)
    else:
        return a
print(add(int(input("Введите делимое: ")),int(input("Введите делитель: "))))            
