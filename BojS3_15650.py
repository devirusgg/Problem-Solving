# N과 M (2)
import sys

global n, m, resultList


def solution():
    global n, m, resultList
    n, m = map(int, sys.stdin.readline().split())
    resultList = []

    dfs(0, 1, [])

    for lst in resultList:
        print(*lst)


def dfs(depth, idx, lst):
    if depth == m:
        resultList.append(lst)
        return
    for i in range(idx, n + 1):
        dfs(depth + 1, i + 1, lst + [i])


if __name__ == '__main__':
    solution()
