# Swea_D4_1861_정사각형 방
"""
"import sys" 가 제한되므로 "setRecursionLimit" 설정이 불가하여 해당문제는 dfs로 풀 수 없음
"""
import sys
sys.setrecursionlimit(10 ** 6)

global n, mv, graph, dx, dy, visit


def solution(tc):
    global n, mv, graph, dx, dy, visit
    n = int(input())
    graph = [list(map(int, input().split())) for _ in range(n)]
    visit = [[False for _ in range(n)] for _ in range(n)]

    answer = [999999999, 0]
    dx = [0, -1, 0, 1]
    dy = [-1, 0, 1, 0]
    for i in range(n):
        for j in range(n):
            mv = 0
            c = graph[i][j]
            visit[i][j] = True
            dfs(i, j, c)
            if mv > answer[1]:
                answer[0] = c
                answer[1] = mv
            elif mv == answer[1]:
                answer[0] = min(answer[0], c)
                answer[1] = mv
            visit[i][j] = False
    print(f"#{tc} {answer[0]} {answer[1]}")


def dfs(x, y, c):
    global mv, visit
    mv += 1
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <= nx < n and 0 <= ny < n and not visit[nx][ny] and graph[nx][ny] == c + 1:
            visit[nx][ny] = True
            dfs(nx, ny, graph[nx][ny])
            visit[nx][ny] = False


if __name__ == '__main__':
    t = int(input())
    for tc in range(1, t + 1):
        solution(tc)
