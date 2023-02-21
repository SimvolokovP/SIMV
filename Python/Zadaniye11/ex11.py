#Последние цифры зачетки - 72
import json
import requests
from pprint import pprint
from tkinter import*
def write():
    with open('data.txt','w') as file:
        username = txt_box.get()
        url = f"https://api.github.com/users/{username}"
        data = requests.get(url).json()
        keys = ['company', 'created_at', 'email', 'id', 'name', 'url']
        for i in keys:
            if i in data:
                file.write(f"{i}:{data[i]}" + '\n')    
    pprint(data)


window = Tk()
window.title('Задание-11')
lbl = Label(window, text="Привет!Введи имя репозитория!",font=(24))
lbl.grid(column=0, row=0)
lbl2 = Label(window, text='#последние цифры зачетки = 72, репозиторий: "web-platform-tests"')
lbl2.grid(column=0, row=2)
window.geometry('600x300')
txt_box = Entry(window,width=40,font=('Times new roman', 12),background='yellow')
txt_box.grid(column=0, row=1)
button = Button(window, text = 'клик',command = write)
button.grid(column=0, row=3)
window.mainloop()