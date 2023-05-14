# Swea_D4_1211_Ladder2
def solution():
    ladder = [list(map(int, input().split())) for _ in range(100)]
    starts = []
    for i in range(100):
        if ladder[0][i] == 1:
            starts.append(i)

    result = []
    for start in starts:
        result.append([move(start, ladder), start])
    result.sort()
    return result[0][1]


def move(start, ladder):
    visit = [[False for _ in range(100)] for _ in range(100)]
    i = 0
    j = start
    visit[i][start] = True

    widthMove = 0
    while True:
        if j != 0 and ladder[i][j-1] == 1 and not visit[i][j-1]:
            j -= 1
            widthMove += 1
            visit[i][j] = True
        elif j != 99 and ladder[i][j+1] == 1 and not visit[i][j+1]:
            j += 1
            widthMove += 1
            visit[i][j] = True
        elif i != 99 and ladder[i+1][j] == 1 and not visit[i+1][j]:
            i += 1
            visit[i][j] = True
        else:
            break
    return i + widthMove


if __name__ == '__main__':
    for i in range(10):
        tc = int(input())
        print(f"#{tc} {solution()}")
