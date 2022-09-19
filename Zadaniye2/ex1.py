import math
x = 14.26
y = -1.22
z = 3.5*10**-2
s = (2*math.cos(x-2/3))*(1+(z**2/(3-z**2/5)))/(1/2+math.pow(math.sin(y), 2))
print("Переменная s равна {0:.6f}".format(s))