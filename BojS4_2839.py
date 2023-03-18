# 설탕 배달
def solution(n):
    cnt = 0
    while n >= 3:
        if n % 5 == 0:
            cnt += n // 5
            return cnt
        else:
            n -= 3
            cnt += 1

    if n != 0:
        return -1
    else:
        return cnt


if __name__ == '__main__':
    n = int(input())
    print(solution(n))
