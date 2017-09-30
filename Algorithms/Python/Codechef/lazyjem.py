for test in range(int(input())):
	p,b,s = map(int, input().split())
	tot = []
	while p > 0:
		if p % 2 != 0:
			p = (p + b) / s
		else:
			p = p / 2
		x = p * s + b
		s = s + s
		tot.append(x)
	print(sum(tot))

