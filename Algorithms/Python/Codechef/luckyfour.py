for i in range(int(input())):
	a = input()
	lucky = list(map(int, a))
	num = 0
	for i in range(len(lucky)):
		if lucky[i] == 4:
			num += 1

	print(num)