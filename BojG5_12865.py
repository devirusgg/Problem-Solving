# BojG5_12865_평범한 배낭
import sys

def solution():
    n, k = map(int, sys.stdin.readline().split())
    bag = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]

    dp = [[0 for _ in range(k + 1)] for _ in range(n + 1)]
    for i in range(1, n + 1):
        for j in range(1, k + 1):
            if bag[i-1][0] > j:
                dp[i][j] = dp[i-1][j]
                continue
            cv = bag[i-1][1] + dp[i-1][j - bag[i-1][0]]
            dp[i][j] = max(dp[i-1][j], cv)
    return dp[n][k]


if __name__ == '__main__':
    print(solution())
