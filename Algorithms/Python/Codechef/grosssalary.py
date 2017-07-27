for i in range(int(input())):
	basic_salary = int(input())
	if basic_salary < 1500:
		gross_salary = basic_salary * 2
	elif basic_salary >= 1500:
		gross_salary = basic_salary + 500 + basic_salary * 0.98	
	print("%g" % (gross_salary))