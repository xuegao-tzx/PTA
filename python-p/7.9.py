##7-9 用天平找小球
'''
2021.10.12
09.21.28
By Xcl
'''
a,b,c=map(int,input().split())
if(a==b):
    if(b!=c):
        print("C")
else:
    if(b==c):
        print("A")
    else:
        print("B")
