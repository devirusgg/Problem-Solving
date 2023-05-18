# Swea_D3_15612_체스판 위의 룩 배치
from collections import deque


def solution():
    board = [list(input()) for _ in range(8)]

    row = [False for _ in range(8)]
    column = [False for _ in range(8)]
    cnt = 0
    for i in range(8):
        for j in range(8):
            if board[i][j] != 'O':
                continue

            if row[i] or column[j]:
                return "no"
            else:
                row[i] = True
                column[j] = True
                cnt += 1

    return "yes" if cnt == 8 else "no"


def solution_bfs():
    board = [list(input()) for _ in range(8)]

    cnt = 0
    for i in range(8):
        for j in range(8):
            if board[i][j] != 'O':
                continue

            cnt += 1
            for direction in range(0, 3, 2):
                if not bfs(i, j, direction, board):
                    return "no"

    return "yes" if cnt == 8 else "no"


def bfs(x, y, direction, board):
    q = deque()
    q.append((x, y))
    visit = [[False for _ in range(8)] for _ in range(8)]
    dx = [0, 0, -1, 1]
    dy = [-1, 1, 0, 0]

    while q:
        cx, cy = q.popleft()
        visit[cx][cy] = True

        for i in range(direction, direction + 2):
            nx = cx + dx[i]
            ny = cy + dy[i]
            if 0 <= nx < 8 and 0 <= ny < 8 and visit[nx][ny] == False:
                if board[nx][ny] == 'O':
                    return False
                q.append((nx, ny))
    return True


if __name__ == '__main__':
    t = int(input())
    for tc in range(1, t + 1):
        print(f"#{tc} {solution()}")
