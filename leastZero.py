l = int(input())
k = int(input())

min = (l-k)/(k+1)

if min - int(min) > 0:
    min = int(min) + 1

print(min)