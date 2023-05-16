# Swea_D3_1244_최대 상금
global arr, visit, length, answer


def solution():
    global arr, visit, length, answer
    ipt, cnt = input().split()
    arr = list(ipt)
    cnt = int(cnt)
    visit, length = {}, len(arr)
    answer = -1

    dfs(cnt)
    return answer


def dfs(cnt):
    if cnt <= 0:
        global answer
        temp = int("".join(arr))
        if answer < temp:
            answer = temp
        return

    for i in range(length):
        for j in range(i + 1, length):
            arr[i], arr[j] = arr[j], arr[i]
            innerTemp = "".join(arr)
            if visit.get((innerTemp, cnt - 1), 1):
                visit[(innerTemp, cnt - 1)] = 0
                dfs(cnt - 1)
            arr[i], arr[j] = arr[j], arr[i]


if __name__ == '__main__':
    t = int(input())
    for tc in range(1, t + 1):
        print(f"#{tc} {solution()}")
