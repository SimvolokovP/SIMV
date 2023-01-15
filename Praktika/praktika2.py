from tkinter import*
from tkinter import ttk
from tkinter import messagebox as mb
import logging






status = ''
code = ''
summa = 0

with open('atm.txt') as file:
    n100 = int(file.readline())
    n200 = int(file.readline())
    n500 = int(file.readline())
    n1000 = int(file.readline())
print(n100, n200, n500, n1000)

dep = 1000

def save():
    lines = [str(n100), str(n200), str(n500), str(n1000)]
    with open(r'atm.txt', "w") as file:
        for  line in lines:
            file.write(line + '\n')

def ready():
    btn_ready.destroy()
    headtext.configure(text='Отлично! Введите пин-код')
    code_text.grid(column=0, row=1)
    btn_ok.grid(column=0, row=3)
    code_error.grid(column=0, row=2)

def ok():
    code = code_text.get()
    if len(code) == 4:  
        logging.info("Пин-код пользователя: "+ code)                    
        if code == '0000':
            status = 'admin'
            headtext.configure(text='Меню банкомата(админ)')
            btn_ok.destroy()
            code_text.destroy()
            code_error.destroy()
            btn_save.grid(column=0,row=5)
            lbl_100.grid(column=0,row=1)
            var_100.grid(column=1,row=1)
            btn_plus100.grid(column=2,row=1)
            lbl_200.grid(column=0,row=2)
            var_200.grid(column=1,row=2)
            btn_plus200.grid(column=2,row=2)
            lbl_500.grid(column=0,row=3)
            var_500.grid(column=1,row=3)
            btn_plus500.grid(column=2,row=3)
            lbl_1000.grid(column=0,row=4)
            var_1000.grid(column=1,row=4)
            btn_plus1000.grid(column=2,row=4)
            btn_logg.grid(column=0,row=6)
        else:
            btn_ok.destroy()
            headtext.configure(text='Меню банкомата')
            code_text.destroy()
            code_error.destroy()
            lbl_deposite.grid(column=0,row=1)
            lbl_balance.grid(column=2,row=1)
            lbl_withdraw.grid(column=4,row=1)
            btn.grid(column=2, row=2)
            btn_w100.grid(column=4,row=2)
            btn_w200.grid(column=5,row=2)
            btn_w500.grid(column=6,row=2)
            btn_w1000.grid(column=7,row=2)
            
            deposite_entry.grid(column=0, row=2)
            deposite_button.grid(column=0, row=3)
            non_money.grid(column=0,row=4)
    else:
        headtext.configure(text="Ошибка, повторите пин-код")  


def deposite():
    global dep
    global n100
    summa = deposite_entry.get()
    value = balance.get()   
    balance.set(value + int(summa))
    dep += int(summa) 
    logging.info(f"Внесена сумма :{str(summa)}.")
    m_dep()
    print(dep)

def w100():
    global n100
    global dep
    value = balance.get()   
    if n100 > 0 and dep >= 100:
        n100 -= 1
        save()
        print(n100)
        if dep >= 100:
            balance.set(value - 100)
            dep -= 100 
            non_money.configure(text="")
            logging.info(f"Снято 100 руб")
        else:
            m_non_balance()
    else:
        m_non_valute()    

def w200():
    global n200
    global dep
    value = balance.get()
    if n200 > 0 and dep >=200:
        n200 -= 1
        save()
        if dep >= 200:   
            balance.set(value - 200)
            dep -= 200
            print(dep)
            non_money.configure(text="")
            logging.info(f"Снято 200 руб")
        else:
            m_non_balance() 
    else:
        m_non_valute()  

def w500():
    global dep
    global n500
    value = balance.get()
    if n500 > 0 and dep >=500:
        n500 -= 1
        save()
        if dep >= 500:
            balance.set(value - 500)
            dep -= 500
            non_money.configure(text="")
            logging.info(f"Снято 500 руб")
        else:
            m_non_balance()
    else:
        m_non_valute()         
def w1000():
    global dep
    global n1000
    value = balance.get()
    if n1000 > 0 and dep >= 1000:
        n1000 -= 1
        save()  
        if dep >= 1000: 
            balance.set(value - 1000)     
            dep -= 1000
            non_money.configure(text="")
            logging.info(f"Снято 1000 руб")
        else:
            m_non_balance()
    else:
        m_non_valute()  


def plus100():
    global n100
    value = pok_n100.get()
    pok_n100.set(value + 1)
    n100 += 1
def plus200():
    global n200
    value = pok_n200.get()
    pok_n200.set(value + 1)
    n200 += 1
def plus500():
    global n500
    value = pok_n500.get()
    pok_n500.set(value + 1)
    n500 += 1   
def plus1000():
    global n1000
    value = pok_n1000.get()
    pok_n1000.set(value + 1)
    n1000 += 1     
def logg():
    logg_screen = Toplevel(window)
    logg_screen.title('Logg')
    with open("py_log.log") as file:
        int_number = file.read()
        print(int_number)
    logg_lbl = Label(logg_screen, text=int_number,font=(24))  
    logg_lbl.grid(column=0, row=0)  


window = Tk()

balance = IntVar(value=dep)
pok_n100 = IntVar(value=n100)
pok_n200 = IntVar(value=n200)
pok_n500 = IntVar(value=n500)
pok_n1000 = IntVar(value=n1000)


window.geometry('600x300')
window.title('Банкомат')
window["bg"] = "blue"

btn = ttk.Button(textvariable=balance)
var_100 = ttk.Button(textvariable=pok_n100)
var_200 = ttk.Button(textvariable=pok_n200)
var_500 = ttk.Button(textvariable=pok_n500) 
var_1000 = ttk.Button(textvariable=pok_n1000) 


btn_ready = Button(window, text = 'Начать',command = ready)
btn_ready.grid(column=0, row=1)
headtext = Label(window, text="Банкомат готов к работе!",font=(24))
headtext.grid(column=0, row=0)
code_text = Entry(window,width=40,font=('Times new roman', 12),background='yellow',show="*")
btn_ok = Button(window, text = 'Ок',command = ok)
code_error = Label(window, text="Пин-код содержит 4 цифры!",font=(10))
lbl_deposite = Label(window, text="Внести сумму",font=(10))
lbl_balance = Label(window, text="Баланс:",font=(10))
lbl_withdraw = Label(window, text="     Снять деньги",font=(10))

btn_w100 = Button(window, text = '100',command = w100)
btn_w200 = Button(window, text = '200',command = w200)
btn_w500 = Button(window, text = '500',command = w500)
btn_w1000 = Button(window, text = '1000',command = w1000)
deposite_entry = Entry(window,width=40,font=('Times new roman', 8),background='yellow')
deposite_button = Button(window, text = 'Внести деньги',command = deposite)
non_money = Label(window, text="",font=(4))
btn_save = Button(window, text = 'Сохранить',command = save)
lbl_100 = Label(window, text="В банкомате купюр по 100 рублей:",font=(10))
lbl_200 = Label(window, text="В банкомате купюр по 200 рублей:",font=(10))
lbl_500 = Label(window, text="В банкомате купюр по 500 рублей:",font=(10))
lbl_1000 = Label(window, text="В банкомате купюр по 1000 рублей:",font=(10))

btn_plus100 = Button(window, text = '+',command = plus100)
btn_plus200 = Button(window, text = '+',command = plus200)
btn_plus500 = Button(window, text = '+',command = plus500)
btn_plus1000 = Button(window, text = '+',command = plus1000)
btn_logg = Button(window, text = 'Логи',command = logg)

def m_dep():
    mb.showinfo(
                "Ура!!!", 
                "Средства внесены")
def m_non_valute():
    mb.showerror(
                "Ошибка!!!", 
                "Извните, но в данный момент в банкомте отстутствует купюра данного номинала") 
def m_non_balance():
    mb.showwarning(
                "Ошибка!!!", 
                "На вашем балансе недостаточно средств")                  



logging.basicConfig(level=logging.INFO, filename="py_log.log",filemode="w",
                    format="%(asctime)s %(levelname)s %(message)s")
logging.debug("A DEBUG Message")
logging.info("An INFO")
logging.warning("A WARNING")
logging.error("An ERROR")
logging.critical("A message of CRITICAL severity")





window.mainloop()