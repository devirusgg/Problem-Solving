# Swea_D3_5215_햄버거 다이어트
def solution():
    n, l = map(int, input().split())
    material = [list(map(int, input().split())) for _ in range(n)]

    dp = [[0 for _ in range(l + 1)] for _ in range(n + 1)]
    for i in range(1, n + 1):
        for j in range(1, l + 1):
            if material[i-1][1] > j:
                dp[i][j] = dp[i-1][j]
                continue

            pt = material[i-1][0] + dp[i-1][j - material[i-1][1]]
            dp[i][j] = max(dp[i-1][j], pt)
    return dp[n][l]


if __name__ == '__main__':
    t = int(input())
    for tc in range(1, t + 1):
        print(f"#{tc} {solution()}")
