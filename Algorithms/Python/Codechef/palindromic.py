for test in range(int(input())):
	a,b = map(int, input().split())
	total = 0
	for i in range(a,b+1):
		n = str(i)
		if n == n[::-1]:
			total += i
	print(total)