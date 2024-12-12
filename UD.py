n = int(input())
s = input()
count = 0
for i in s:
    if i == "U": count += 1
    if i ==  "D": count -= 1

print(count)