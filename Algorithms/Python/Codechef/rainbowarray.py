for j in range(int(input())):
	n = int(input())
	numbers = list(map(int, input().split()))
	half = int(n / 2)
	list1 = []
	list2 = []
	for i in range(half):
		list1.append(numbers[i])
	for k in range(half, 0, -1):
		list2.append(numbers[-k])
	if sorted(list1) == sorted(list2):
		for l in range(max(numbers)):
			if l in numbers:
				ans = 'yes'
			else:
				ans = 'no'	
	else:
		ans = 'no'
	print(ans)
	
	

	
