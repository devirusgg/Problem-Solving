# BojS2_2644_촌수계산
import sys
from collections import deque

global n, a, b, relation, visit


def solution():
    global n, a, b, relation, visit
    n = int(sys.stdin.readline())
    a, b = map(int, sys.stdin.readline().split())
    m = int(sys.stdin.readline())
    relation = [[] for _ in range(n+1)]
    for i in range(m):
        x, y = map(int, sys.stdin.readline().split())
        relation[x].append(y)
        relation[y].append(x)

    visit = [0 for _ in range(n+1)]
    return bfs(a, b)


def bfs(v, end):
    global relation, visit
    queue = deque()
    queue.append(v)
    visit[v] = 1

    while queue:
        c = queue.popleft()
        for nxt in relation[c]:
            if nxt == end:
                return visit[c]
            if visit[nxt] == 0:
                queue.append(nxt)
                visit[nxt] = visit[c]+1
    return -1


if __name__ == '__main__':
    print(solution())
