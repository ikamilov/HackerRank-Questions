for test in range(int(input())):
	a,b = map(float, input().split())
	off = (a * 10) / 100
	if a > 1000:
		total = (a-off) * b
	else:
		total = a * b
	print(format(total, '.6f'))