for test in range(int(input())):
	t = list(input())
	l = []
	for i in t:
		if i not in l:
			l.append(i)
	if len(l) == 2:
		print("YES")
	else:
		print("NO")