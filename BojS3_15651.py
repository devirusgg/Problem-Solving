# N과 M (3)
import sys

global N, M, resultList


def solution():
    global N, M, resultList
    N, M = map(int, sys.stdin.readline().split())
    resultList = []

    dfs(0, [])
    for result in resultList:
        print(*result)


def dfs(depth, lst):
    global N, M, resultList
    if depth == M:
        resultList.append(lst)
        return

    for i in range(1, N+1):
        dfs(depth+1, lst+[i])


if __name__ == '__main__':
    solution()
