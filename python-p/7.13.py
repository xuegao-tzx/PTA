##7-13 日K蜡烛图 
'''
2021.10.12
17.05.24
By Xcl
'''
a,b,c,d=map(float,input().split())
if(d<a):
    print('BW-Solid',end='')
    if(c<a and c<d):
        print(' with Lower Shadow',end='')
        if(b>a and b>d):
            print(' and Upper Shadow',end='')
    else:
        if(b>a and b>d):
            print(' with Upper Shadow',end='')
else:
    if(d!=a):
        print('R-Hollow',end='')
        if(c<a and c<d):
            print(' with Lower Shadow',end='')
            if(b>a and b>d):
                print(' and Upper Shadow',end='')
            else:
                if(b>a and b>d):
                    print(' with Upper Shadow',end='')
    else:
        print('R-Cross',end='')
        if(c<a and c<d):
            print(' with Lower Shadow',end='')
            if(b>a and b>d):
                print(' and Upper Shadow',end='')
        else:
            if(b>a and b>d):
                print(' with Upper Shadow',end='')
