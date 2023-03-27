# 음식물 피하기
import sys
sys.setrecursionlimit(10001)


def solution(n, m, k):
    global road, results, result
    road = [[0 for _ in range(m)] for _ in range(n)]
    for _ in range(k):
        r, c = map(int, sys.stdin.readline().split())
        road[r - 1][c - 1] = 1

    for i in range(n):
        for j in range(m):
            if dfs(j, i):
                results.append(result)
                result = 0
    # results.sort(reverse=True)
    # return results[0]
    return max(results)


def dfs(x, y):
    if 0 <= x < m and 0 <= y < n and road[y][x] == 1:
        global result
        result += 1
        road[y][x] = 0
        dfs(x - 1, y)
        dfs(x, y - 1)
        dfs(x + 1, y)
        dfs(x, y + 1)
        return True
    return False


if __name__ == '__main__':
    n, m, k = map(int, sys.stdin.readline().split())
    road, results, result = [], [], 0
    print(solution(n, m, k))
