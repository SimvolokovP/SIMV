import math
x = 6.251
y = 0.827
z = 25.001
s = math.pow(y, math.pow(abs(x), 1/3)) + math.pow(math.cos(y), 3)*(abs(x-y)*(1+(math.pow(math.sin(z),2))/math.pow((x+y),1/2)))/(math.pow(math.e, abs(x-y))+x/2)
print("Переменная s равна {0:.6f}".format(s))