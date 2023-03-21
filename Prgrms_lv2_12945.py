# 피보나치 수
import sys

sys.setrecursionlimit(10 ** 6)  # 파이썬은 재귀호출 카운트에 제한이 있다. 이를 늘리는 코드

arr = [0] * 100001


# DP
def solution(n):
    if arr[n] != 0:
        return arr[n]
    if n == 2:
        return 1
    if n == 1:
        return 1
    arr[n] = solution(n - 1) + solution(n - 2)
    return arr[n] % 1234567


# for 사용. 위 리스트와 재귀호출 상관없이 동작
def solution2(n):
    num1, num2 = 0, 1
    for i in range(n):
        num1, num2 = num2, num1 + num2
    return num1 % 1234567


if __name__ == '__main__':
    # print(solution(100000))
    print(solution2(100000))
