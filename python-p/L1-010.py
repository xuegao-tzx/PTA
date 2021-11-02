##L1-010 比较大小
'''
2021.11.2
21.32.08
By Xcl
'''
s=input().split()
a=[]
for i in s:
    a.append(int(i))
a= sorted(a)
for i in range(3):
    if i==2:
        print(a[i])
    else:
        print(a[i],end='->')
