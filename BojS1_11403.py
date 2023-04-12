# BojS1_11403_경로 찾기
import sys

global n, g, visit


def solution():
    global n, g, visit
    n = int(sys.stdin.readline())
    g = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
    visit = [0 for _ in range(n)]

    for i in range(n):
        dfs(i)
        print(*visit)
        visit = [0 for _ in range(n)]


def dfs(x):
    global visit
    for j in range(n):
        if visit[j] == 0 and g[x][j] == 1:
            visit[j] = 1
            dfs(j)


if __name__ == '__main__':
    solution()
