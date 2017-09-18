def puppysum(a, b):
	tot = 0
	if a == 0:
		return b
	else:
		for i in range(b+1):
			tot += i
	return puppysum(a-1, tot)

for test in range(int(input())):
	a,b = map(int, input().split())
	ans = puppysum(a, b)
	print(ans)
