# Swea_D4_1219_길찾기
from collections import deque

global tcNum, nodeCnt, visit, adjList, flag


def solution():
    global tcNum, nodeCnt, visit, adjList, flag
    tcNum, nodeCnt = map(int, input().split())
    visit = [False for _ in range(100)]
    adjList = [[] for _ in range(100)]

    inptList = list(map(int, input().split()))
    for i in range(0, nodeCnt * 2, 2):
        # 일방통행
        adjList[inptList[i]].append(inptList[i + 1])

    for l in adjList:
        l.sort()

    # bfs ##############################
    bfs()
    ####################################

    # dfs ##############################
    # flag = False
    # dfs(0)
    # if flag:
    #     print(f"#{tcNum} 1")
    #     return
    # print(f"#{tcNum} 0")
    ####################################


def bfs():
    q = deque(adjList[0])
    visit[0] = True
    while q:
        c = q.popleft()
        for nxt in adjList[c]:
            if nxt == 99:
                print(f"#{tcNum} 1")
                return
            if not visit[nxt]:
                q.append(nxt)
                visit[nxt] = True
    print(f"#{tcNum} 0")


def dfs(x):
    global flag
    if x == 99:
        flag = True
        return

    for i in adjList[x]:
        visit[i] = True
        dfs(i)
        visit[i] = False


if __name__ == '__main__':
    for _ in range(10):
        solution()
