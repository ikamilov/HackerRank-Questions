# https://www.codechef.com/problems/NITIKA
#Input - Output
# gandhi -> Gandhi
# mahatma gandhI -> M. Gandhi
# Mohndas KaramChand ganDhi -> M. K. Gandhi

a = int(input())
for j in range(a):
	x = input()
	z = x.split()

	for i in range(len(z)-1):
		y = list(z[i])
		print(str(y[0].upper()) + ".", end=" ")
	print(str(z[-1].title()))