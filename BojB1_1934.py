# 최소공배수
# ----- 유클리드 호제법 -----
def gcd(aNum, bNum):
    x = aNum
    y = bNum
    while True:
        r = x % y
        if r == 0:
            break
        x = y
        y = r
    return y


def lcm(aNum, bNum):
    return aNum * bNum // gcd(aNum, bNum)


# ----- 브루트포스 -----
def bf_solution(aNum, bNum):
    if aNum > bNum:
        return bf_lcm(aNum, bNum)
    else:
        return bf_lcm(bNum, aNum)


def bf_lcm(bigNum, smallNum):
    for i in range(1, bigNum):
        num = smallNum * i
        if num % bigNum == 0:
            return num
    return bigNum * smallNum


if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        aNum, bNum = map(int, input().split())
        print(lcm(aNum, bNum))
        print(bf_solution(aNum, bNum))
