n = int(input("Введите число: "))
def add(x):
    if x == 0:
        return 1 #я этого в жизни не знал
    else:
        return add(x-1) * x
print("Факториал числа равен:",add(n))