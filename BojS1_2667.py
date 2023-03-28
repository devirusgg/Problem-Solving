# 단지번호붙이기
import sys


def solution():
    global n, graph, results, result
    for i in range(n):
        for j in range(n):
            if dfs(i, j):
                results.append(result)
                result = 0

    results.sort()
    resultsLength = len(results)
    print(resultsLength)
    for i in range(resultsLength):
        print(results[i])


def dfs(x, y):
    global graph, result
    if 0 <= x < n and 0 <= y < n and graph[x][y] == "1":
        result += 1
        graph[x][y] = "0"
        dfs(x, y-1)
        dfs(x-1, y)
        dfs(x, y+1)
        dfs(x+1, y)
        return True
    return False


if __name__ == '__main__':
    n = int(sys.stdin.readline())
    graph = []
    results, result = [], 0
    for _ in range(n):
        graph.append(list(sys.stdin.readline().rstrip()))
    solution()
