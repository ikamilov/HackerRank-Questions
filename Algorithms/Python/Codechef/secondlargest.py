for i in range(int(input())):
	number = list(map(int, input().split()))
	total = sum(number) - max(number) - min(number)
	print(total)
	
