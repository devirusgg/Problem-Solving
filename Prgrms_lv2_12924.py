# 숫자의 표현
def solution(n):
    cnt = 0
    for i in range(1, n+1):
        sum = 0
        j = i
        while sum < n:
            sum += j
            j += 1
            if sum == n:
                cnt += 1
    return cnt


if __name__ == '__main__':
    print(solution(15))
