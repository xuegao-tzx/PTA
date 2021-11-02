##L1-062 幸运彩票
'''
2021.11.2
19.10.30
By Xcl
'''
n=int(input())
sum1=0
sum2=0
i=0
j=0
for i in range(n):
        sum1=0
        sum2=0
        str = input()
        ch=[]
        ch.extend(str)
        sum1=int(ch[0])+int(ch[1])+int(ch[2])
        sum2=int(ch[3])+int(ch[4])+int(ch[5])
        if(sum1==sum2):
            print("You are lucky!")
        else:
            print("Wish you good luck.")
