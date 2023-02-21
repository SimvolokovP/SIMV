#Вариант-11(1)
def add(x):
    for i in range(x, 2*x - 1):
        print("Близнецы:",i,"и",i+2)
n = int(input("Введите число:(больше 2) "))
if n > 2:
    add(n)
else:  
    print("Введите число больше 2!")