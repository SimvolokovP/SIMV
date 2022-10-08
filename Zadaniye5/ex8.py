def add():
    a = 0
    i = 0
    i_max = 0
    b = int(input())
    while b != 0:
        if a == b:
            i += 1
        else:
            a = b
            i_max = max(i_max, i)
            i = 1
        b = int(input())
    i_max = max(i_max, i)
    return(i_max)
print(add())