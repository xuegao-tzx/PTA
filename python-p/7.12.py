##7-12 两个数的简单计算器
'''
2021.10.09
22.17.45
By Xcl
'''
a,c,b = input().split()
a = int(a)
b = int(b)
if c == '+':  
    print(a+b)
elif c == '-':  
    print(a-b)
elif c == '*': 
    print(a*b)
elif c == '/':  
    print(int(a/b))
elif c == '%':  
    print(a%b)
else:
    print('ERROR')
