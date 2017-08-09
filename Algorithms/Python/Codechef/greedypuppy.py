for test in range(int(input())):
	n,k = map(int, input().split())
	coins = 0
	for i in range(1, k+1):
		if n % i > coins:
			coins = n % i
	print(coins)