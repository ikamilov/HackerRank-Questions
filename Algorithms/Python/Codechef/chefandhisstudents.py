for test in range(int(input())):
	s = list(input().strip())
	count = 0
	for i, j in enumerate(s[:1]):
		if j != s[i + 1]:
			if (j == "<" and s[i + 1] == ">") or (s[i+1] == "<" and j == ">"):
				count += 1
		else:
			count += 0
		
	print(count)

