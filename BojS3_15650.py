# N과 M (2)
import sys


def dfs(n, m, depth):
    if depth == m:
        if arr.count(0) == 0:
            print(*arr)
        arr[depth - 1] = 0
        return

    for i in range(n):
        if not visit[i]:
            visit[i] = True
            value = i + 1
            if depth == 0:
                arr[depth] = value
            elif value > arr[depth - 1]:
                arr[depth] = value
            dfs(n, m, depth + 1)
            visit[i] = False


if __name__ == '__main__':
    n, m = map(int, sys.stdin.readline().split())
    visit = [False for _ in range(n)]
    arr = [0 for _ in range(m)]
    dfs(n, m, 0)
