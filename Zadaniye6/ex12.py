#Варинат-12
S1 = str(input("Введите текст: "))
def add(str):
    a = 'я' 
    for i in str.split():
        if i.endswith(a):
            print('Слово, оканчивающееся на "я":',i)
add(S1)            