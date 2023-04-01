# 적록색약
import sys
sys.setrecursionlimit(11000)


def solution(n):
    global graph, tempGraph, cbGraph
    for i in range(n):
        v = sys.stdin.readline()
        graph.append(list(v.rstrip()))
        if "G" in v:
            v = v.replace("G", "R")
        cbGraph.append(list(v.rstrip()))

    rgbRG = [0 for _ in range(4)]
    countingRed(n, rgbRG)
    countingGreen(n, rgbRG)
    countingBlue(n, rgbRG)
    countingRG(n, rgbRG)

    result = [0, 0]
    for i in range(3):
        result[0] += rgbRG[i]
    result[1] = rgbRG[2] + rgbRG[3]
    return result


def countingRed(n, rgbRG):
    global tempGraph
    tempGraph = graph
    for i in range(n):
        for j in range(n):
            if rdfs(i, j):
                rgbRG[0] += 1


def countingGreen(n, rgbRG):
    global tempGraph
    tempGraph = graph
    for i in range(n):
        for j in range(n):
            if gdfs(i, j):
                rgbRG[1] += 1


def countingBlue(n, rgbRG):
    global tempGraph
    tempGraph = graph
    for i in range(n):
        for j in range(n):
            if bdfs(i, j):
                rgbRG[2] += 1


def countingRG(n, rgbRG):
    for i in range(n):
        for j in range(n):
            if rgdfs(i, j):
                rgbRG[3] += 1


def rgdfs(x, y):
    if 0 <= x < n and 0 <= y < n and cbGraph[x][y] == "R":
        cbGraph[x][y] = "X"
        rgdfs(x, y - 1)
        rgdfs(x - 1, y)
        rgdfs(x, y + 1)
        rgdfs(x + 1, y)
        return True
    return False


def rdfs(x, y):
    if 0 <= x < n and 0 <= y < n and tempGraph[x][y] == "R":
        tempGraph[x][y] = "X"
        rdfs(x, y - 1)
        rdfs(x - 1, y)
        rdfs(x, y + 1)
        rdfs(x + 1, y)
        return True
    return False


def gdfs(x, y):
    if 0 <= x < n and 0 <= y < n and tempGraph[x][y] == "G":
        tempGraph[x][y] = "X"
        gdfs(x, y - 1)
        gdfs(x - 1, y)
        gdfs(x, y + 1)
        gdfs(x + 1, y)
        return True
    return False


def bdfs(x, y):
    if 0 <= x < n and 0 <= y < n and tempGraph[x][y] == "B":
        tempGraph[x][y] = "X"
        bdfs(x, y - 1)
        bdfs(x - 1, y)
        bdfs(x, y + 1)
        bdfs(x + 1, y)
        return True
    return False


if __name__ == '__main__':
    n = int(sys.stdin.readline())
    graph, tempGraph, cbGraph = [], [], []
    print(*solution(n))
