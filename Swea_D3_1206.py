# Swea_D3_1206_View
def solution2():
    n = int(input())
    buildingTops = list(map(int, input().split()))

    cnt = 0
    for i in range(2, n - 2):
        nearMaxTop = max(buildingTops[i-2], buildingTops[i-1], buildingTops[i+1], buildingTops[i+2])
        if buildingTops[i] > nearMaxTop:
            cnt += buildingTops[i] - nearMaxTop
    return cnt


def solution():
    n = int(input())
    h = list(map(int, input().split()))
    buildings = [[0 for _ in range(n)] for _ in range(max(h))]
    for j in range(n):
        for i in range(h[j]):
            buildings[i][j] = 1

    cnt = 0
    for j in range(2, n - 2):
        for i in range(h[j]):
            if buildings[i][j-1] == 0 and buildings[i][j-2] == 0:
                if buildings[i][j+1] == 0 and buildings[i][j+2] == 0:
                    cnt += 1
    return cnt


if __name__ == '__main__':
    for tc in range(1, 11):
        print(f"#{tc} {solution2()}")
        # print(f"#{tc} {solution()}")
