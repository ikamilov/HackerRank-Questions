for i in range(int(input())):
	number = int(input())
	c = 0
	for k in range(1, number):
		if number % k == 0:
			c += 1
	if c == 1:
		print('yes')
	else:
		print("no")