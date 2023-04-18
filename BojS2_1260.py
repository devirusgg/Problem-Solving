# BojS2_1260_DFS와 BFS
import sys
from collections import deque

global n, m, v, link, visit, dfsResult, bfsResult


def solution():
    global n, m, v, link, visit, dfsResult, bfsResult
    n, m, v = map(int, sys.stdin.readline().split())
    link = [[] for _ in range(n+1)]
    for _ in range(m):
        x, y = map(int, sys.stdin.readline().split())
        link[x].append(y)
        link[y].append(x)
    for i in range(len(link)):
        link[i].sort()

    dfsResult = []
    visit = [False for _ in range(n+1)]
    dfs(v)

    bfsResult = []
    visit = [False for _ in range(n+1)]
    bfs(v)

    print(*dfsResult)
    print(*bfsResult)


def dfs(x):
    global link, visit, dfsResult
    if not visit[x]:
        visit[x] = True
        dfsResult.append(x)
        for i in link[x]:
            dfs(i)


def bfs(x):
    global link, visit, bfsResult
    queue = deque()
    queue.append(x)
    visit[x] = True
    bfsResult.append(x)

    while queue:
        c = queue.popleft()
        for i in link[c]:
            if not visit[i]:
                visit[i] = True
                queue.append(i)
                bfsResult.append(i)


if __name__ == '__main__':
    solution()
