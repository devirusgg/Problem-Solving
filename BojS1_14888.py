# BojS1_14888_연산자 끼워넣기
import sys

global n, a, operator, result


def solution():
    global n, a, operator, result
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    operator = list(map(int, sys.stdin.readline().split()))
    result = [-1000000000, 1000000000]

    dfs(0, 0, a[0])

    for i in range(2):
        print(result[i])


def dfs(d, idx, value):
    global n, a, operator, result
    if d == n-1:
        result[0] = max(result[0], value)
        result[1] = min(result[1], value)
        return

    if operator[0] > 0:
        operator[0] -= 1
        dfs(d+1, idx+1, value + a[idx+1])
        operator[0] += 1

    if operator[1] > 0:
        operator[1] -= 1
        dfs(d+1, idx+1, value - a[idx+1])
        operator[1] += 1

    if operator[2] > 0:
        operator[2] -= 1
        dfs(d+1, idx+1, value * a[idx+1])
        operator[2] += 1

    if operator[3] > 0:
        operator[3] -= 1
        if value < 0:
            value *= -1
            value //= a[idx+1]
            value *= -1
            dfs(d+1, idx+1, value)
        else:
            dfs(d+1, idx+1, value // a[idx+1])
        operator[3] += 1


if __name__ == '__main__':
    solution()
