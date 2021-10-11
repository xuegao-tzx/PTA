##7-11 分段计算居民水费
'''
2021.10.11
22.18.42
By Xcl
'''
a=float(input())
if(a<=15):
    b=(4*a)/3
else:
    b=2.5*a-17.5
print('%.2f'%b)
