# Prgrms_lv2_131701_연속 부분 수열 합의 개수
def solution(elements):
    size = len(elements)
    sumList = [0]
    s = 0
    for i in range(size):
        s += elements[i]
        sumList.append(s)

    result = set()
    for sumIdx in range(1, size + 1):
        if sumIdx == size + 1:
            result.add(sumList[size + 1])
            break

        for i in range(size):
            c = 0
            tempIdx = sumIdx + i
            if tempIdx >= size + 1:
                c = sumList[size]
                tempIdx -= size
            c += sumList[tempIdx] - sumList[i]
            result.add(c)
    return len(result)


def solution_timeout(elements):
    size = len(elements)
    result = set()

    for cnt in range(1, size + 1):
        for idx in range(size):
            s = 0
            for i in range(cnt):
                nxt = idx + i
                if nxt >= size:
                    nxt -= size
                s += elements[nxt]
            result.add(s)
    return len(result)


if __name__ == '__main__':
    print(solution([7, 9, 1, 1, 4]))
    # print(solution_timeout([7, 9, 1, 1, 4]))
