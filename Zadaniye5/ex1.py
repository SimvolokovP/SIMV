N = int(input("Введите число: "))
def add(x):
    i = 1
    while i**2 <= x:
        print (i**2)
        i += 1
add(N)