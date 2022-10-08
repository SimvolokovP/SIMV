n = int(input("Введите число: "))
def add(x):
    a = 2
    b = 1
    const = 2
    while a <= x:
        a *= const
        b += 1
    print("Наибольшее число, непревосходящее N:",a // 2,",это",b-1, "степень двойки")
add(n)    