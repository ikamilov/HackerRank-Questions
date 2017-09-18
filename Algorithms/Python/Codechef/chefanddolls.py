for test in range(int(input())):
	dolls = []
	
	t = int(input())
	for test in range(t):
		dolls.append(int(input()))
	for i in set(dolls):
		if dolls.count(i) % 2 == 1:
			print(i)