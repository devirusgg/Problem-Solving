# 분해합
import sys
n = int(sys.stdin.readline())
num = 1
flag = False

# while (True):
for _ in range(n):
    sum = num
    strNum = str(num)
    for i in range(len(strNum)):
        sum += int(strNum[i])

    if (sum == n):
        flag=True
        break

    num += 1

if(flag):
    print(str(num))
else:
    print(0)
    
