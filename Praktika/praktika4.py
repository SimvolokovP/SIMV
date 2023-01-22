#Pavel Simvolokov,№38
from tkinter import*
from tkinter import ttk
from tkinter import messagebox as mb
import logging
import os


pin_code = ''
status = ''

window_main = Tk()
window_main.title('Банкомат')



def f_start():
    logging.info("Старт работы! ")
    btn_start.destroy()
    txt_head.config(text='Введите ваш пин-код: ')
    btn_ok.grid(row=4, sticky=N)
    ent_pin.grid(row=3, sticky=N)


def f_load():
    global n50
    global n100
    global n500
    global n1000
    with open('C:\\Users\\79521\\Documents\\GitHub\\SimvolokovPE\\Praktika\\atm.txt') as file:
        n50 = int(file.readline())
        n100 = int(file.readline())
        n500 = int(file.readline())
        n1000 = int(file.readline())
        file.close
    print(n50, n100, n500, n1000)

def save():
    lines = [str(n50), str(n100), str(n500), str(n1000)]
    with open(r'C:\\Users\\79521\\Documents\\GitHub\\SimvolokovPE\\Praktika\\atm.txt', "w") as file:
        for  line in lines:
            file.write(line + '\n')
            file.close

def f_balance():
    global window_balance
    def f_exit_balance():
        window_balance.destroy()
    
    print('Баланс')
    file = open(temp_code, 'r')
    file_data = file.read()
    user_details = file_data.split('\n')
    details_code = user_details[0]
    details_balance = user_details[1]
    file.close

    window_balance = Toplevel(window_main)
    window_balance.title('Баланс')
    Label(window_balance,text='Ваш текущий баланс: ',font=('Calibri',14)).grid(row=0,sticky=N)
    Label(window_balance,text=details_balance,font=('Calibri',14)).grid(row=1,sticky=N)
    btn_exit_balance = Button(window_balance, text='Закрыть', font=('Calibri',12),width=20,command=f_exit_balance)
    btn_exit_balance.grid(row=2,sticky=N)

def f_deposite():
    global window_deposite
    def f_exit_deposite():
        window_deposite.destroy()
    global summa 
    global lbl_current_balance
    summa = StringVar()
    file = open(temp_code,'r')
    file_data = file.read()
    user_details = file_data.split('\n')
    details_balance = user_details[1]
    print(details_balance)
    window_deposite = Toplevel(window_main)
    window_deposite.title('Ввод средств')
    Label(window_deposite,text='Сумма: ',font=('Calibri',14)).grid(row=1,sticky=N)
    lbl_current_balance = Label(window_deposite,text='Текущий баланс: '+ details_balance,font=('Calibri',14))
    lbl_current_balance.grid(row=0,sticky=N)
    ent_summa = Entry(window_deposite, textvariable=summa)
    ent_summa.grid(row=1,column=1)
    btn_deposite = Button(window_deposite, text='Внести', font=('Calibri',12),width=10, command=deposite)
    btn_exit_deposite = Button(window_deposite, text='Закрыть', font=('Calibri',12),width=10, command=f_exit_deposite)
    btn_deposite.grid(row=2,sticky=W)
    btn_exit_deposite.grid(row=2,sticky=W, column=1)

   

    

def f_withrow():
    global lbl_current_balance
    def f_exit_withrow():
        window_withrow.destroy()
    global window_withrow
    file = open(temp_code,'r')
    file_data = file.read()
    user_details = file_data.split('\n')
    details_balance = user_details[1]
    print(details_balance)
    window_withrow = Toplevel(window_main)
    window_withrow.title('Вывод средств')
    Label(window_withrow,text='Сумма: ',font=('Calibri',14)).grid(row=1,sticky=N)
    lbl_current_balance = Label(window_withrow,text='Текущий баланс: '+ details_balance,font=('Calibri',14))
    lbl_current_balance.grid(row=0,sticky=N)
    btn_w50 = Button(window_withrow, text='50', font=('Calibri',12),width=10, command=f_w50)
    btn_w100 = Button(window_withrow, text='100', font=('Calibri',12),width=10, command=f_w100)
    btn_w500 = Button(window_withrow, text='500', font=('Calibri',12),width=10, command=f_w500)
    btn_w1000 = Button(window_withrow, text='1000', font=('Calibri',12),width=10, command=f_w1000)
    btn_exit_withrow = Button(window_withrow, text='Закрыть', font=('Calibri',12),width=10, command=f_exit_withrow)
    btn_w50.grid(row=2,sticky=W)
    btn_w100.grid(row=3,sticky=W)
    btn_w500.grid(row=4,sticky=W)
    btn_w1000.grid(row=5,sticky=W)
    btn_exit_withrow.grid(row=2,sticky=W, column=1)



def f_close():
    logging.info("Сеанс завершен")
    window_user.destroy()
    window_deposite.destroy()
    window_balance.destroy()
    print('Закрыть')
    

def deposite():
    if summa.get() == '':
        mb_deposite_entry()
    if float(summa.get()) <= 0:
        mb_deposite_entry()
    file = open(temp_code,'r+')
    file_data = file.read()
    details = file_data.split('\n')
    current_balance = details[1]
    updated_balance = current_balance
    if float(summa.get()) > 0:
        updated_balance = float(updated_balance) + float(summa.get())
        logging.info("Внесена сумма: "+ str(summa.get()))
    file_data = file_data.replace(current_balance, str(updated_balance))
    file.seek(0)
    print(updated_balance)
    file.truncate(0)
    file.write(file_data)
    file.close
    lbl_current_balance.config(text='Текущий баланс: '+str(updated_balance))

def f_w50():
    global n50
    file = open(temp_code,'r+')
    file_data = file.read()
    details = file_data.split('\n')
    current_balance = details[1]
    updated_balance = current_balance
    if float(current_balance) >= 50:
        if n50 > 0:
            updated_balance = float(updated_balance) - float(50)
            logging.info("Выдача купюры,номиналом 50")
            n50 -= 1
            print(n50)
        else:
            mb_non_valute()
    file_data = file_data.replace(current_balance, str(updated_balance))
    file.seek(0)
    print(updated_balance)
    file.truncate(0)
    file.write(file_data)
    file.close
    lbl_current_balance.config(text='Текущий баланс: '+str(updated_balance))   
    save() 




def f_w100():
    global n100 
    file = open(temp_code,'r+')
    file_data = file.read()
    details = file_data.split('\n')
    current_balance = details[1]
    updated_balance = current_balance
    if float(current_balance) >= 100:
        if n100 > 0:
            updated_balance = float(updated_balance) - float(100)
            logging.info("Выдача купюры,номиналом 100")
            n100 -= 1
        else:
            mb_non_valute()    
    file_data = file_data.replace(current_balance, str(updated_balance))
    file.seek(0)
    print(updated_balance)
    file.truncate(0)
    file.write(file_data)
    file.close
    lbl_current_balance.config(text='Текущий баланс: '+str(updated_balance))
    save()


def f_w1000():
    global n1000
    file = open(temp_code,'r+')
    file_data = file.read()
    details = file_data.split('\n')
    current_balance = details[1]
    updated_balance = current_balance
    if float(current_balance) >= 1000:
        if n1000 > 0:
            updated_balance = float(updated_balance) - float(1000)
            logging.info("Выдача купюры,номиналом 1000")
            n1000 -= 1
        else:
            mb_non_valute()     
    file_data = file_data.replace(current_balance, str(updated_balance))
    file.seek(0)
    print(updated_balance)
    file.truncate(0)
    file.write(file_data)
    file.close
    lbl_current_balance.config(text='Текущий баланс: '+str(updated_balance))
    save()




def f_w500():
    global n500
    file = open(temp_code,'r+')
    file_data = file.read()
    details = file_data.split('\n')
    current_balance = details[1]
    updated_balance = current_balance
    if float(current_balance) >= 500:
        if n500 > 0:
            updated_balance = float(updated_balance) - float(500)
            logging.info("Выдача купюры,номиналом 500")
            n500 -= 1
        else:
            mb_non_valute()    
    file_data = file_data.replace(current_balance, str(updated_balance))
    file.seek(0)
    print(updated_balance)
    file.truncate(0)
    file.write(file_data)
    file.close
    lbl_current_balance.config(text='Текущий баланс: '+str(updated_balance))
    save()



def plus_n50():
    global n50
    n50 += 1
    logging.info("Внесена купюра,номиналом 50")
    lbl_n50.config(text='Кол-во купюр по 50: ' + str(n50))
    save()
def plus_n100():
    global n100
    n100 += 1
    logging.info("Внесена купюра,номиналом 100")
    lbl_n100.config(text='Кол-во купюр по 100: ' + str(n100))
    save()
def plus_n500():
    global n500
    n500 += 1
    logging.info("Внесена купюра,номиналом 500")
    lbl_n500.config(text='Кол-во купюр по 500: ' + str(n500))
    save()
def plus_n1000():
    global n1000
    n1000 += 1
    logging.info("Внесена купюра,номиналом 1000")
    lbl_n1000.config(text='Кол-во купюр по 1000: ' + str(n1000))
    save()           



def f_logg():
    logg_screen = Toplevel(window_main)
    logg_screen.title('Логи')
    with open("py_log.log") as file:
        int_number = file.read()
        print(int_number)
        file.close
    logg_lbl = Text(logg_screen)  
    logg_lbl.grid(row=0, column=0)
    logg_lbl.insert(1.0,int_number)
    ys = ttk.Scrollbar(logg_screen,orient = "vertical", command = logg_lbl.yview)
    ys.grid(column = 1, row = 0, sticky = NS)
    logg_lbl["yscrollcommand"] = ys.set

def f_ok():
    global lbl_n50
    global lbl_n500
    global lbl_n100
    global lbl_n1000
    global temp_code
    global window_user
    pin_code = ent_pin.get()
    all_accounts = os.listdir()
    if len(pin_code) == 4:
        logging.info("Пин-код пользователя: "+ pin_code)
        f_load()
        if pin_code != '0000':
            for code_check in all_accounts:
                if pin_code == code_check:
                    ent_pin.delete(0,4)
                    print('Аккаунт создан')
                    file = open(pin_code,'r')
                    file_data = file.read()
                    file_data = file_data.split('\n')
                    print(file_data)
                    file.close
                    temp_code = pin_code
                    ent_pin.config(textvariable='')
                    window_user = Toplevel(window_main)
                    window_user.title('Мой кабинет')
                    Label(window_user, text='Банкомат №C128', font=('Calibri',14)).grid(row=0,sticky=N)
                    Label(window_user, text='Добро пожаловать!', font=('Calibri',14)).grid(row=1,sticky=N)
                    btn_balance = Button(window_user, text='Баланс', font=('Calibri',12),width=20,command=f_balance)
                    btn_deposite = Button(window_user, text='Ввод средств', font=('Calibri',12),width=20,command=f_deposite)
                    btn_withrow = Button(window_user, text='Вывод средств', font=('Calibri',12),width=20,command=f_withrow)
                    btn_close = Button(window_user, text='Завершить сеанс', font=('Calibri',12),width=20,command=f_close)
                    btn_balance.grid(row=2,sticky=N)
                    btn_deposite.grid(row=3,sticky=N)
                    btn_withrow.grid(row=4,sticky=N)
                    btn_close.grid(row=5,sticky=N)
                    return
            else:
                new_file = open(pin_code,'w')
                new_file.write(pin_code + '\n')
                new_file.write('0')
                new_file.close
        else:
            ent_pin.delete(0,4)
            window_user = Toplevel(window_main)
            window_user.title('Админ')
            lbl_n50 = Label(window_user, text='Кол-во купюр по 50: ' + str(n50), font=('Calibri',14))
            lbl_n50.grid(column=0,row=0)
            btn_plus50 = Button(window_user, text='+',command=plus_n50)
            btn_plus50.grid(column=1,row=0)
            lbl_n100 = Label(window_user, text='Кол-во купюр по 100: ' + str(n100), font=('Calibri',14))
            lbl_n100.grid(column=0,row=1)
            btn_plus100 = Button(window_user, text='+',command=plus_n100)
            btn_plus100.grid(column=1,row=1)
            lbl_n500 = Label(window_user, text='Кол-во купюр по 500: ' + str(n500), font=('Calibri',14))
            lbl_n500.grid(column=0,row=2)
            btn_plus500 = Button(window_user, text='+',command=plus_n500)
            btn_plus500.grid(column=1,row=2)
            lbl_n1000 = Label(window_user, text='Кол-во купюр по 1000: ' + str(n1000), font=('Calibri',14))
            lbl_n1000.grid(column=0,row=3)
            btn_plus1000 = Button(window_user, text='+',command=plus_n1000)
            btn_plus1000.grid(column=1,row=3)
            btn_close = Button(window_user, text='Завершить сеанс', font=('Calibri',12),width=20,command=f_close)
            btn_close.grid(row=4,column=0)
            btn_logg = Button(window_user, text='Логи', font=('Calibri',12),width=20,command=f_logg)
            btn_logg.grid(row=4,column=1)

    else:
        mb_len_code()             





def mb_len_code():
    mb.showwarning(
                "Ошибка!!!", 
                "Пин-код должен состоять из 4 цифр!") 
def mb_deposite_entry():
    mb.showwarning(
                "Ошибка!!!", 
                "Введите положительное число!!!")          
def mb_non_valute():
    mb.showerror(
                "Ошибка!!!", 
                "Извните, но в данный момент в банкомте отстутствует купюра данного номинала")                                      


txt_head = Label(window_main, text='Банкомат готов к работе!', font=('Calibri',14))
txt_head.grid(row=0, sticky=N)
btn_start = Button(window_main, text='Начать!', font=('Calibri',12),width=20, command=f_start)
btn_start.grid(row=3, sticky=N)
btn_ok = Button(window_main, text='Ок!', font=('Calibri',12),width=20,command=f_ok)
ent_pin = Entry(window_main,font=('Calibri',12),width=20, show="*")

logging.basicConfig(level=logging.INFO, filename="py_log.log",filemode="a",
                    format="%(asctime)s %(levelname)s %(message)s")


window_main.mainloop()