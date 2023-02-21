#5
def add(x):
    if x > 0:
        print(x%10)
        print('*'*5)
        add(x//10)
add(int(input("Введите число: ")))  