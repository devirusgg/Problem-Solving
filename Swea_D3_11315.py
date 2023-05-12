# Swea_D3_11315_오목 판정
global n, board, visit, cnt, dx, dy


def solution():
    global n, board, visit, cnt, dx, dy
    n = int(input())
    board = [list(input()) for _ in range(n)]
    visit = [[False for _ in range(n)] for _ in range(n)]
    dx = [0, 0, -1, 1, -1, 1, -1, 1]
    dy = [-1, 1, 0, 0, -1, 1, 1, -1]

    for i in range(n):
        for j in range(n):
            if board[i][j] == 'o':
                cnt = 1
                visit[i][j] = True
                for k in range(4):
                    dfs(i, j, k)
                    if cnt == 5:
                        return "YES"
                    cnt = 1
                visit[i][j] = False
    return "NO"


def dfs(x, y, direction):
    global cnt
    if cnt >= 5:
        return

    for i in range(2 * direction, 2 * (direction + 1)):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <= nx < n and 0 <= ny < n and board[nx][ny] == 'o' and not visit[nx][ny]:
            cnt += 1
            visit[nx][ny] = True
            dfs(nx, ny, direction)
            visit[nx][ny] = False


if __name__ == '__main__':
    for tn in range(1, int(input()) + 1):
        print(f"#{tn} {solution()}")
