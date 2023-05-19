# BojS1_7562_나이트의 이동
import sys
from collections import deque


def solution():
    l = int(sys.stdin.readline())
    sx, sy = map(int, sys.stdin.readline().split())
    ex, ey = map(int, sys.stdin.readline().split())
    return bfs(l, sx, sy, ex, ey)


def bfs(l, sx, sy, ex, ey):
    q = deque()
    dx = [-1, -2, -2, -1, 1, 2, 2, 1]
    dy = [-2, -1, 1, 2, 2, 1, -1, -2]
    visit = [[False for _ in range(l)] for _ in range(l)]
    q.append((sx, sy, 0))
    visit[sx][sy] = True

    while q:
        cx, cy, cmv = q.popleft()
        if cx == ex and cy == ey:
            return cmv

        for i in range(8):
            nx = cx + dx[i]
            ny = cy + dy[i]
            if 0 <= nx < l and 0 <= ny < l and not visit[nx][ny]:
                q.append((nx, ny, cmv + 1))
                visit[nx][ny] = True


if __name__ == '__main__':
    for tc in range(int(sys.stdin.readline())):
        print(solution())
