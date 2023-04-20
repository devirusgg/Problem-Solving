# BojS2_1012_bfs_유기농 배추
import sys
from collections import deque

global m, n, k, dx, dy


def solution():
    global m, n, k, dx, dy
    m, n, k = map(int, sys.stdin.readline().split())
    farm = [[0 for _ in range(m)] for _ in range(n)]
    for i in range(k):
        y, x = map(int, sys.stdin.readline().split())
        farm[x][y] = 1

    dx = [0, -1, 0, 1]
    dy = [-1, 0, 1, 0]
    result = 0
    for i in range(n):
        for j in range(m):
            if farm[i][j] == 1:
                if bfs(farm, i, j):
                    result += 1
    return result


def bfs(graph, x, y):
    q = deque()
    q.append((x, y))
    graph[x][y] = 0

    while q:
        x, y = q.popleft()
        for i in range(len(dx)):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < n and 0 <= ny < m and graph[nx][ny] == 1:
                graph[nx][ny] = 0
                q.append((nx, ny))
    return True


if __name__ == '__main__':
    t = int(sys.stdin.readline())
    for i in range(t):
        print(solution())
