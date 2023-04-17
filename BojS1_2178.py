# BojS1_2178_미로 탐색
import sys
from collections import deque

global n, m, graph


def solution():
    global n, m, graph
    n, m = map(int, sys.stdin.readline().split())
    graph = []
    for i in range(n):
        graph.append(list(map(int, sys.stdin.readline().rstrip())))
    return bfs(0, 0)


def bfs(x, y):
    queue = deque()
    queue.append((x, y))
    dx = [0, -1, 0, 1]
    dy = [-1, 0, 1, 0]
    global n, m, graph

    while queue:
        x, y = queue.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < n and 0 <= ny < m and graph[nx][ny] == 1:
                graph[nx][ny] = graph[x][y] + 1
                if nx == n-1 and ny == m-1:
                    return graph[nx][ny]
                queue.append((nx, ny))


if __name__ == '__main__':
    print(solution())
