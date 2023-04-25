# Prgrms_lv2_37805_카펫
def solution(brown, yellow):
    yw, yh = 1, 1
    w = yw + 2
    h = yh + 2
    while True:
        while yw * yh <= yellow:
            if yellow == yw * yh and brown == (w * h) - yellow:
                return [w, h]
            yw += 1
            w = yw + 2
        yw = 1
        yh += 1
        h = yh + 2


if __name__ == '__main__':
    print(solution(10, 2))
    print(solution(8, 1))
    print(solution(24, 24))
