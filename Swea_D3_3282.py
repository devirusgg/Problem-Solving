# Swea_D3_3282_Knapsack
def solution():
    n, k = map(int, input().split())
    bag = [list(map(int, input().split())) for _ in range(n)]

    dp = [[0 for _ in range(k + 1)] for _ in range(n + 1)]
    for i in range(1, n + 1):
        for j in range(1, k + 1):
            if bag[i-1][0] > j:
                dp[i][j] = dp[i-1][j]
                continue

            temp = bag[i-1][1] + dp[i-1][j - bag[i-1][0]]
            dp[i][j] = max(temp, dp[i-1][j])
    return dp[n][k]


if __name__ == '__main__':
    t = int(input())
    for tc in range(1, t + 1):
        print(f"#{tc} {solution()}")
