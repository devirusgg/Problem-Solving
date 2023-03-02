# 영화감독 숌
# n = int(input())
import sys

n = int(sys.stdin.readline())
cnt = 0
endingNumber = 665

while (cnt != n):
    endingNumber += 1
    if '666' in str(endingNumber):
        cnt += 1

print(endingNumber)
