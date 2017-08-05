for i in range(int(input())):
	n = int(input())
	s = input()
	for k in s:
		if k == 'I':
			ans = "INDIAN"
			break
		elif k == 'Y':
			ans = "NOT INDIAN"
			break
		else:
			ans = "NOT SURE"
	print(ans)