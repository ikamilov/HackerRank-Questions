withdraw,money = map(float, input().split())

if (money - withdraw - 0.50) >= 0 and withdraw % 5 == 0:
	money = money - withdraw - 0.50
	print(format(money, '.2f'))
else:
	print(format(money, '.2f'))


