##7-3 逆序的三位数
'''
2021.10.09
19.25.40
By Xcl
'''
a = int(input())
b=int(a/100)
c=int((a%100)/10)
d=int((a%100)%10)
if(d==0):
    print(b+c*10)
else:
    print(b+c*10+d*100)
