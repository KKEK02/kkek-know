def isEqual(array1,array2):
    array1 = input("enter array 1").split()
    array2 = input("enter array 2").split()
    #
    temp = array2
    for i in array1:
        if i in temp:
            temp.remove(i)
    if temp == []:
        print(True)
    else: print(False)


def isPerfectNumber(n):
    number = str(n)
    sum = 0
    for i in number:
        sum += int(i) ** 2
print(isPerfectNumber(input()))     