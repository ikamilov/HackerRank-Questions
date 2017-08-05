for i in range(int(input())):
	number = int(input())
	n = number
	reverse = 0
	while number > 0:
		remainder = number % 10
		reverse = (reverse * 10) + remainder
		number = number // 10

	if n == reverse:
		print("wins")
	else:
		print("losses")