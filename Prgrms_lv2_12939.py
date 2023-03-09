# 최댓값과 최솟값
def solution(s):
    strList = s.split()
    arrList = [int(i) for i in strList]
    arrList.sort()

    return str(arrList[0]) + " " + str(arrList[-1])


def solution_2(s):
    arrList = list(map(int, s.split()))
    return str(min(arrList)) + " " + str(max(arrList))


print(solution_2("1 2 3 4"))
print(solution("-1 -2 -3 -4"))
print(solution("-1 -1"))
