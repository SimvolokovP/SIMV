def add():
    with open('SimvolokovPE_Y-223_vvod.txt') as file:
        a = [list(map(int, i.split())) for i in file.readlines()[2:]]
        minimum = [min(i) for i in a]
        min_s = minimum.index(min(minimum))    
        print("Номер строки, содержащей минимальный элемент:",min_s+1) 
        summa = sum(a[min_s])
        print("Сумма элементов строки с наименьшим значением:",summa)
    f = open('SimvolokovPE_Y-223_vyvod.txt','w')
    f.write(str(summa))
    f.close
add()