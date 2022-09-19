import math
x = 3.251
y = 0.325
z = 0.466*10**-4
s = (math.pow(2, math.pow(y, x)) + math.pow(math.pow(3, x),y)) - (y*(math.atan(z)-1/3)/(abs(x)+1/(y**2+1))) 
print("Переменная s равна {0:.5f}".format(s))
