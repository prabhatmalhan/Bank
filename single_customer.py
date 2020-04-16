#Single Customer Control


class Account:
    
    def __init__(self,owner,balance):
        
        self.owner=owner
        self.balance=balance
        
    
    def __str__(self):
        return f'Account Owner : {self.owner}\nAccount Balance: {self.balance}'
    
    
    def deposit(self,money):
        print('Deposit Accepted')
        self.balance+=money
        
        
    def withdraw(self,money):
        if(money<=self.balance):
            print('Withdrawl Accepted')
            self.balance-=money
        else:
            print('Funds Unavailable')


name=input('Enter the customer\'s name : ')
bal=float(input('Enter the balance in account : '))
acc=Account(name,bal)
while True:
    print('Type (\'w\' for withdrawl , \'d\' for deposite , \'e\' for exit)')
    ch=input('Enter choice : ')
    if ch.lower()=='w' :
        acc.withdraw(float(input('Money to be withdrawn : ')))
        print(f'Your available account balance = {acc.balance}\n')
    elif ch.lower()=='d' :
        acc.deposit(float(input('Money to be deposited : ')))
        print(f'Your available account balance = {acc.balance}\n')
    elif ch.lower()=='e':
        break
    else:
        print('OOPs! Error Occured')

