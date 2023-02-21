n = int(input("Введите число рядов Фибоначчи: "))
def add(x): 
    fib1 = fib2 = 1 
    print(fib1)
    print(fib2)
    s = fib1 + fib2
    for i in range(2, n):
        fib1, fib2 = fib2, fib1 + fib2
        s += fib2
        print(fib2)
    return(s)
print("Сумма:",add(n))    