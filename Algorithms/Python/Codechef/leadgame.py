player1 = []
player2 = []
score = []
for i in range(int(input())):
	p1,p2 = map(int, input().split())
	if p1 > p2:
		player1.append(p1 - p2)
	elif p1 < p2:
		player2.append(p2 - p1)
score = player1 + player2
if max(player1) > max(player2): 
	print("2 " + str(max(score)))
elif max(player1) < max(player2): 
	print("2 " + str(max(score)))
