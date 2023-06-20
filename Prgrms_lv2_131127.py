# Prgrms_lv2_131127_할인 행사
def solution(want, number, discount):
    wantCnt = sum(number)
    wantDict = dict(zip(want, number))
    answer = 0
    n = len(discount) - wantCnt
    for i in range(n + 1):
        discountDict = dict()
        for j in range(i, i + wantCnt):
            if discount[j] in discountDict.keys():
                discountDict[discount[j]] += 1
            else:
                discountDict[discount[j]] = 1
        if discountDict == wantDict:
            answer += 1
    return answer


if __name__ == '__main__':
    print(solution(
        ["banana", "apple", "rice", "pork", "pot"],
        [3, 2, 2, 2, 1],
        ["chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"]
    ))
    print(solution(
        ["apple"],
        [10],
        ["banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"]
    ))
