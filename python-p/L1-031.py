##L1-031 到底是不是太胖了
'''
2021.11.2
21.49.08
By Xcl
'''
n = int(input())
a = []
for i in range(n):
    temp = input().split()
    c = int(temp[0])
    b = int(temp[1])
    b2 = (c - 100) * 1.8
    if abs(b2 - b) < b2 * 0.1:
        a.append('wan mei!')
    else:
        if b2 >b:
            a.append('tai shou le!')
        else:
            a.append('tai pang le!')
for i in a:
    print('You are ' + i)
