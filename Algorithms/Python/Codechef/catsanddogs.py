x = int(input())
for i in range(x):
	cdl = input()
	a = cdl.split()
	cats = int(a[0])
	dogs = int(a[1])
	legs = int(a[2])
	answer = 'yes'
	if legs%4 != 0 or legs > (cats+dogs)*4 or legs < (dogs)*4:
		answer = "no"
	else: 
		if cats>dogs or legs<(cats-dogs)*4:
			answer = "no"
	print(answer)

