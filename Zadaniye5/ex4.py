x = int(input("Введите кол-во км в первый день: "))
y = int(input("Итоговое расстояние: "))
def add(a,b):
    p = 1.1
    i = 1
    while a < b:
        a *= p
        i += 1
    print ("Спортсмену понадобится",i,"дней")
add(x,y)