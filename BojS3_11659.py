# BojS3_11659_구간 합 구하기 4
import sys


def solution():
    n, m = map(int, sys.stdin.readline().split())
    arr = list(map(int, sys.stdin.readline().split()))

    sumList = [0]
    s = 0
    for i in range(n):
        s += arr[i]
        sumList.append(s)

    for i in range(m):
        start, end = map(int, sys.stdin.readline().split())
        psum(sumList, start, end)


def psum(sumList, start, end):
    print(sumList[end] - sumList[start - 1])


if __name__ == '__main__':
    solution()
