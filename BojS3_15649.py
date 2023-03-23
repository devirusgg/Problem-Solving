# N과 M
def dfs(n, m, depth):
    if depth == m:
        for i in arr:
            print(i, end=" ")
        print()
        return

    for i in range(n):
        if not visit[i]:
            visit[i] = True
            arr[depth] = i + 1
            dfs(n, m, depth + 1)
            visit[i] = False


n, m = map(int, input().split())
visit = [False for _ in range(n)]
arr = [0 for _ in range(m)]
dfs(n, m, 0)
