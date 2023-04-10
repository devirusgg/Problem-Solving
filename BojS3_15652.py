# BojS3_15652_N과 M (4)
import sys

global n, m, results, start


def solution():
    global n, m, results, start
    n, m = map(int, sys.stdin.readline().split())
    results = []

    dfs(0, [], 1)

    for result in results:
        print(*result)


def dfs(depth, lst, s):
    global n, m, results
    if depth == m:
        results.append(lst)
        return

    for i in range(s, n + 1):
        dfs(depth+1, lst+[i], i)


if __name__ == '__main__':
    solution()
