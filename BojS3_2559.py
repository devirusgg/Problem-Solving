# BojS3_2559_수열
import sys


def solution():
    n, k = map(int, sys.stdin.readline().split())
    arr = list(map(int, sys.stdin.readline().split()))

    sumList = []
    s = 0
    for i in range(k):
        s += arr[i]
    sumList.append(s)
    for i in range(k, n):
        s += arr[i]
        s -= arr[i - k]
        sumList.append(s)
    return max(sumList)


if __name__ == '__main__':
    print(solution())
