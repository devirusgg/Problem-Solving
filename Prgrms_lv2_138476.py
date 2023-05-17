# Prgrms_lv2_138476_귤 고르기
# import operator

def solution(k, tangerine):
    cntDic = {}
    for size in tangerine:
        if size in cntDic:
            cntDic[size] += 1
        else:
            cntDic[size] = 1
    sortDic = sorted(cntDic.items(), key=lambda x: x[1], reverse=True)
    # sortDic = sorted(cntDic.items(), key=operator.itemgetter(1), reverse=True)

    cnt = 0
    for i in range(len(sortDic)):
        cnt += sortDic[i][1]
        if cnt >= k:
            return i + 1


if __name__ == '__main__':
    print(solution(6, [1, 3, 2, 5, 4, 5, 2, 3]))
    print(solution(4, [1, 3, 2, 5, 4, 5, 2, 3]))
    print(solution(2, [1, 1, 1, 1, 2, 2, 2, 3]))
