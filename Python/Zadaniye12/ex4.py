#4
def add(n, s):
    if n == 0:
        return s
    s += n % 10
    n //= 10
    return add(n,s)    
print(add(int(input("Введите число: ")),0))        