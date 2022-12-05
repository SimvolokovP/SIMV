#B2
a = []
def add(a):
    n = int(input("Введите число: "))
    if n == 0:
        return a
    a.append(n)   
    return add(a)
s = add(a)
s.sort()    
print('Второе число по величине:',s[-2]) 