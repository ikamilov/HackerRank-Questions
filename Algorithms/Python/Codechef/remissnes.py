for i in range(int(input())):
	g1,g2 = map(int, input().split())
	total = g1 + g2
	if g1 > g2:
		print(str(g1) + " " + str(total))
	else:
		print(str(g2) + " " + str(total))