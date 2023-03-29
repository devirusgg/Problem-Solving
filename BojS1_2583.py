# 영역 구하기
import sys
sys.setrecursionlimit(11000)


def solution(m, n, k):
    drawRectangle(rectangle, k)

    global results, result
    for i in range(m):
        for j in range(n):
            if dfs(i, j):
                results.append(result)
                result = 0

    results.sort()
    resultsLength = len(results)
    print(resultsLength)
    for i in range(resultsLength):
        print(results[i]) if i == resultsLength - 1 else print(results[i], end=" ")


def dfs(x, y):
    global rectangle, result
    if 0 <= x < m and 0 <= y < n and rectangle[x][y] == 0:
        result += 1
        rectangle[x][y] = 1
        dfs(x, y-1)
        dfs(x-1, y)
        dfs(x, y+1)
        dfs(x+1, y)
        return True
    return False


# 상하 반전된 그림
def drawRectangle(rectangle, k):
    while k > 0:
        ly, lx, ry, rx = map(int, sys.stdin.readline().split())
        for i in range(lx, rx):
            for j in range(ly, ry):
                rectangle[i][j] = 1
        k -= 1


if __name__ == '__main__':
    m, n, k = map(int, sys.stdin.readline().split())
    rectangle = [[0 for _ in range(n)] for _ in range(m)]
    results, result = [], 0
    solution(m, n, k)
