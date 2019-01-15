class calc:
    pass

#### addition
def add ():
        x = raw_input (' enter first number ')
        y = raw_input('enter second number ')
        ans = float(x) + float(y)
        ans1 = str(x + ' + ' + y)
        ans2 = str(ans)
        print (ans1 +  ' equals ' + ans2)
####subtraction
def subt ():
        x = raw_input (' enter first number ')
        y = raw_input('enter second number ')
        ans = float(x) - float(y)
        ans1 = str(x + ' - ' + y)
        ans2 = str(ans)
        print (ans1 +  ' equals ' + ans2)
####division
def divi ():
        x = raw_input (' enter first number ')
        y = raw_input('enter second number ')
        ans = float(x) % float(y)
        ans1 = str(x + ' / ' + y)
        ans2 = str(ans)
        print (ans1 +  ' equals ' + ans2)
##multipication
def multi ():
        x = raw_input (' enter first number ')
        y = raw_input('enter second number ')
        ans = float(x) * float(y)
        ans1 = str(x + ' * ' + y)
        ans2 = str(ans)
        print (ans1 +  ' equals ' + ans2)
##log
def logs (y):
    x = int(y)
    numb = 0
    y = str(numb)
    while x != numb * numb * numb :
        if x == numb :
          numb = numb + 1
          return  y
    

