for i in range(int(input())):
	a,c = map(float, input().split())
	b = int(a)
	ls = int(c)
	minimum = abs((b**2 - ls**2)**0.5)
	maximum = abs((b**2 + ls**2)**0.5)
	print(str(round(minimum,5)) + " " + str(round(maximum,5)))