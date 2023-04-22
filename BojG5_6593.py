# BojG5_6593_상범 빌딩
import sys
from collections import deque

global l, r, c

def solution():
    graph = []
    for i in range(l):
        graph.append([list(sys.stdin.readline().rstrip()) for _ in range(r)])
        sys.stdin.readline()

    result = 0

    for i in range(l):
        for j in range(r):
            for k in range(c):
                if graph[i][j][k] == "S":
                    result = bfs(graph, i, j, k)
    if result == -1:
        return "Trapped!"
    return "Escaped in " + str(result) + " minute(s)."

def bfs(graph, z, x, y):
    q = deque()
    d = 0
    q.append((z, x, y, d))
    dz = [0, 0, 0, 0, -1, 1]
    dx = [0, -1, 0, 1, 0, 0]
    dy = [-1, 0, 1, 0, 0, 0]

    while q:
        z, x, y, d = q.popleft()
        if graph[z][x][y] == 'E':
            return d
        d += 1
        for i in range(6):
            nz = z + dz[i]
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nz < l and 0 <= nx < r and 0 <= ny < c:
                if graph[nz][nx][ny] == 'E':
                    q.append((nz, nx, ny, d))
                if graph[nz][nx][ny] == '.':
                    q.append((nz, nx, ny, d))
                    graph[nz][nx][ny] = d
    return -1


if __name__ == '__main__':
    global l, r, c
    while True:
        l, r, c = map(int, sys.stdin.readline().split())
        if l == 0 and r == 0 and c == 0:
            break
        print(solution())
