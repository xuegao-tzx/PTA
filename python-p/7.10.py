##7-10 计算工资
'''
2021.10.12
09.06.43
By Xcl
'''
a,b=map(float,input().split())
if(a>=5):
    if(b<=40):
        print('%.2f'%(50*b))
    else:
        print('%.2f'%(50*1.5*(b-40)+50*40))
else:
    if(b<=40):
        print('%.2f'%(30*b))
    else:
        print('%.2f'%(30*1.5*(b-40)+30*40))
