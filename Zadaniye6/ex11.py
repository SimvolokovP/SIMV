#Вариант-11
S1 = str(input("Введите текст: "))
S1 += ' '
def add():
    cur = 0
    max = 0
    S2 = S1.replace('!', '.')
    for i in range(0, len(S1)):
        if S1[i] == S1[i-1] == 'н':
            cur += 1
        else:
            cur = 0
        if cur > max:
            max = cur
    a = S1.count('н')
    if a > 0:
        max += 1
    print("Отредактированный текст:",S2)   
    print('Самая длинная последовательность букв "н":',max)           
add()      