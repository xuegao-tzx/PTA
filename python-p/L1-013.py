##L1-013 计算阶乘和
'''
2021.11.2
21.37.08
By Xcl
'''
def f(x):
    if(x==0):
        return 1
    else:
        return x*f(x-1)
n=int(input())
temp=0
for i in range(n):
    temp+=f(i+1)
print(temp)
