a = int(input("Введите число:(не меньше двух) "))
if a < 2:
    print("Некорректное значение")
else:
    def add(x):
        i = 1
        while i <= x:
            i = i+1
            if x % i == 0:
                return i
    print("Наименьший натуральный делитель числа равен:", add(a))           