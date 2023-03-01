# 별 찍기 - 7
inputNum = int(input())
n = inputNum
k = 1

for _ in range(inputNum-1):
    for _ in range(n-1):
        print(' ', end='')
    for _ in range(k):
        print('*', end='')
    print('')
    n -= 1
    k += 2

for _ in range((inputNum*2)-1):
    print('*', end='')
print('')
k -= 2

for _ in range(inputNum-1):
    for _ in range(n):
        print(' ', end='')
    for _ in range(k):
        print('*', end='')
    print('')
    n += 1
    k -= 2
