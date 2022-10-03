from re import S


n = int(input("Введите число: "))
def add(x):
    s = 0
    for i in range(1, x+1):
        s += i**3
    return(s)
print(add(n))    