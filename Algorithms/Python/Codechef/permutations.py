
while(1):
	n = int(input())
	if n == 0:
		break
	else:
		s = input()
		t = s
		s = s.split()
		t = t.split()
		#print(t,s)
		for i in range(len(s)):
			s[int(t[i])-1] = str(i+1)
		s = "".join(s)
		t = "".join(t)
		#print(t,s)
		if s == t:
			print("ambiguous")
		else:
			print("not ambiguous")





"""for i in range(int(input())):
	num = input().split()

	if len(num) == int(max(num)):
		new = []
		for i in range(1, int(max(num)) + 1):
			new.append(str(i))

		if len(new) == len(num) and sorted(new) == sorted(num):
			print("ambigious")
		else:
			print("not ambigious")
		
	else:
		print("not ambigious")"""
