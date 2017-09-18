for test in range(int(input())):
	a = input()
	num = []
	al = []
	for i in a:
		if i.isdigit():
			num.append(int(i))
		elif i.isalpha():
			al.append(i.upper())
    	
	alpha = sorted(al)
	tot = sum(num)
	makeitastring = ''.join(map(str, alpha))
	print(makeitastring + str(tot))
	