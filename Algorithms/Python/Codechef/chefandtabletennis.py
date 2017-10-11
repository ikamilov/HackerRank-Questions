for test in range(int(input())):
	s = input().strip()
	if s.count("1")>s.count("0"):
		print("WIN")
	else:
		print("LOSE")
