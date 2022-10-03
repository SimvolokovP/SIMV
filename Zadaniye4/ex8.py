n = int(input("Введите кол-во ступенек(<=9): "))
def add(x):
    if x > 9:
        print ("Некорректное значение")
    else:
        for i in range (1, x+1):
            for k in range(1, i+1):
                print (k, sep='', end='')  
            print()   
add(n)               