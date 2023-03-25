# 유기농 배추
import sys
sys.setrecursionlimit(10 ** 4)  # O(n*m) = 2500


def solution():
    for _ in range(k):
        y, x = map(int, input().split())
        graph[x][y] = 1

    result = 0
    for i in range(n):
        for j in range(m):
            if dfs(i, j):
                result += 1
    print(result)


def dfs(x, y):
    if x <= -1 or x >= n or y <= -1 or y >= m:
        return False

    if graph[x][y] == 1:
        graph[x][y] = 0
        dfs(x - 1, y)
        dfs(x, y - 1)
        dfs(x + 1, y)
        dfs(x, y + 1)
        return True
    return False


if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        m, n, k = map(int, input().split())
        graph = [[0] * m for _ in range(n)]
        solution()
