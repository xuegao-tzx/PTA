##7-24 约分最简分式 
'''
2021.10.12
19.24.24
By Xcl
'''
a,b=map(int, input().split('/'))
i=b
if(a!=b):
    while i>2:
        i=i-1
        if((a%i==0) and (b%i==0)):
            a=a/i
            b=b/i
else:
    a=1
    b=1
a=int(a)
b=int(b)
print(f'{a}/{b}',end="")