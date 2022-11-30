#Последние цифры зачетки - 72
import json
import requests
from pprint import pprint
from tkinter import*
def write():
    with open('data.json','w') as file:
        username = txt_box.get()
        url = f"https://api.github.com/users/{username}"
        data = requests.get(url).json()
        json.dump(data, file, indent = 4)
    pprint(data)

root = Tk()
root.title('Задание-11')
root.geometry('600x300')
name = Label(root, text = 'Вараинт 72, "web-platform-tests"', font = ('Times new roman', 18))
name.pack(expand=True)
txt_box = Entry(root,width=40,font=('Times new roman', 14))
txt_box.pack(expand=True)
button = Button(root, text = 'клик',command = write)
button.pack(expand=True)
root.mainloop()
