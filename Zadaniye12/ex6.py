#6
def add(n,x):
    if n > 1:
        if n == 2 or n < x*x:
            return('YES')
        if not (n % x):
            return('NO')  
        return add(n, x = x +1)      
n = int( input("Введите число: ") )
print(add(n,2)) 