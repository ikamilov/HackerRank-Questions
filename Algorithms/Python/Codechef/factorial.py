x=int(input())
for i in range(0,x):
  y=int(input())
  count=0
  while(y>=5):
    y//=5
    count+=y
  print(count)