# BojS1_2667_bfs_단지번호붙이기
import sys
from collections import deque

def solution():
    n = int(sys.stdin.readline())
    graph = []
    for i in range(n):
        graph.append(list(map(int, sys.stdin.readline().rstrip())))

    answer = []
    for i in range(n):
        for j in range(n):
            if graph[i][j] == 0:
                continue
            answer.append(bfs(graph, n, i, j))

    answer.sort()
    print(len(answer))
    for ans in answer:
        print(ans)

def bfs(graph, n, x, y):
    q = deque()
    q.append((x, y))
    dx = [0, -1, 0, 1]
    dy = [-1, 0, 1, 0]
    cnt = 0
    graph[x][y] = 0

    while q:
        x, y = q.popleft()
        cnt += 1
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < n and 0 <= ny < n and graph[nx][ny] == 1:
                q.append((nx, ny))
                graph[nx][ny] = 0
    return cnt

if __name__ == '__main__':
    solution()
