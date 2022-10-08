def add():
    i = 0
    while int(input("Введи число: ")) != 0:
        i += 1
    return(i)    
print("Кол-во членов в последовательности:",add())                