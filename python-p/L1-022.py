##L1-022 奇偶分家
'''
2021.11.2
21.43.08
By Xcl
'''
n = int(input())
suma = 0
sumb = 0
x = input().split()
for i in x:
    if int(i)%2==1:
        suma=suma+1
    else:
        sumb=sumb+1
print(suma,sumb)
