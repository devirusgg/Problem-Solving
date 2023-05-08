# Swea_1861_bfs_정사각형 방
from collections import deque

global n, mv, graph


def solution(tc):
    global n, mv, graph
    n = int(input())
    graph = [list(map(int, input().split())) for _ in range(n)]

    answer = [999999999, 0]
    for i in range(n):
        for j in range(n):
            mv = 0
            c = bfs(i, j)
            if mv > answer[1]:
                answer[0] = c
                answer[1] = mv
            elif mv == answer[1]:
                answer[0] = min(answer[0], c)
                answer[1] = mv

    print(f"#{tc} {answer[0]} {answer[1]}")


def bfs(x, y):
    global mv
    q = deque()
    q.append((x, y, graph[x][y]))
    dx = [0, -1, 0, 1]
    dy = [-1, 0, 1, 0]
    current = graph[x][y]

    while q:
        cx, cy, c = q.popleft()
        mv += 1
        for i in range(4):
            nx = cx + dx[i]
            ny = cy + dy[i]
            if 0 <= nx < n and 0 <= ny < n and graph[nx][ny] == c + 1:
                q.append((nx, ny, c + 1))
    return current


if __name__ == '__main__':
    t = int(input())
    for tc in range(1, t + 1):
        solution(tc)
