n = 10
x = 4
y = 5
w = 6
a = [[0] * n for i in range(n)]
for i in range(n):
    for j in range(n):
    	if i < w:
    		a[i][j] = w - i
        

        
for row in a:
    print(' '.join([str(elem) for elem in row]))