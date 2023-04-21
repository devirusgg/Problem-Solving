# BojS1_1743_bfs_음식물 피하기
import sys
from collections import deque

global m, n, k, graph


def solution():
    global m, n, k, graph
    n, m, k = map(int, sys.stdin.readline().split())
    graph = [[0 for _ in range(m)] for _ in range(n)]
    for i in range(k):
        r, c = map(int, sys.stdin.readline().split())
        r -= 1
        c -= 1
        graph[r][c] = 1

    dx = [0, -1, 0, 1]
    dy = [-1, 0, 1, 0]
    answer = 0
    for i in range(n):
        for j in range(m):
            if graph[i][j] == 0:
                continue
            answer = max(answer, bfs(graph, i, j, dx, dy))
    return answer


def bfs(graph, x, y, dx, dy):
    q = deque()
    q.append((x, y))
    result = 0
    while q:
        x, y = q.popleft()
        graph[x][y] = 0
        result += 1

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < n and 0 <= ny < m and graph[nx][ny] == 1:
                q.append((nx, ny))
                graph[nx][ny] = 0
    return result


if __name__ == '__main__':
    print(solution())
