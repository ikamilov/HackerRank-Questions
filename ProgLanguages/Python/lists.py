n = 12
list = []
for i in range(1, n + 1):
	cmd = input().split()
    first = cmd[0]
    if len(first) > 1:
        n1 = int(cmd[1])
        if len(first) > 2:
            n2 = int(cmd[2])
    if first == 'insert': 
        list.insert(n1, n2)
    if first == 'print': 
        print(list)
    elif first == 'remove':
        list.remove(n1)
    elif first == 'append': 
        list.append(n1)
    elif first == 'sort': 
        list.sort()
    elif first == 'pop':
        list.pop()
    elif first == 'reverse':
        list.reverse()