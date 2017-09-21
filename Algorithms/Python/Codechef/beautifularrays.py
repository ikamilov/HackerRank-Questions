
for t in range(int(input())):
    input()
    l=[int(x) for x in input().split()]
    n=0
    for i in range(len(l)):
        if (l[i]==1) or (l[i]==0):
            continue
        for j in range(i+1,len(l)):
            try:
                l.index(l[i]*l[j])
            except:
                n=1
                break
        if n==1:
            break
    if n==0:
        print('yes')
    else:
        print('no')
         