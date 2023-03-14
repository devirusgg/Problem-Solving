# 이진 변환 반복하기
def solution(s):
    idx = 0
    zeroCnt = 0
    while True:
        zeroCnt += s.count("0")
        s = s.replace("0", "")
        s = str(format(len(s), "b"))
        idx += 1
        if s == "1":
            break
    return [idx, zeroCnt]


if __name__ == '__main__':
    print(solution("110010101001"))
    print(solution("01110"))
    print(solution("1111111"))
