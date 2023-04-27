# BojG4_5427_불
import sys
from collections import deque

global w, h, graph, dx, dy, q


def solution():
    global w, h, graph, dx, dy, q
    w, h = map(int, sys.stdin.readline().split())
    graph, start = [], []

    q = deque()
    for i in range(h):
        inpt = sys.stdin.readline()
        if '*' in inpt:
            for j in range(len(inpt)):
                if inpt[j] == '*':
                    q.append((i, j, -1))
        if '@' in inpt:
            start = (i, inpt.index('@'), 0)
        graph.append(list(inpt.strip()))
    q.append(start)

    dx = [0, -1, 0, 1]
    dy = [-1, 0, 1, 0]
    for i in range(h):
        for j in range(w):
            if graph[i][j] == '@':
                bfs()

    result = 1000000
    for i in range(h):
        for j in range(w):
            if i != 0 and i != h - 1:
                if 1 <= j < w - 1:
                    continue
            if graph[i][j] == '@':
                return 1
            elif type(graph[i][j]) == int and graph[i][j] >= 0:
                result = min(result, graph[i][j])

    if result == 1000000:
        return "IMPOSSIBLE"
    return result + 1


def bfs():
    global q
    while q:
        x, y, d = q.popleft()
        if d >= 0:
            d += 1
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < h and 0 <= ny < w and graph[nx][ny] == '.':
                graph[nx][ny] = d
                q.append((nx, ny, d))


if __name__ == '__main__':
    t = int(sys.stdin.readline())
    for _ in range(t):
        print(solution())

"""
반례모음

21
1 1
@
3 3
.#.
#@#
.#.
3 3
...
.@.
...
3 3
.#.
#@#
.#*
8 3
########
#*@.....
########
5 6
##.##
#...#
#.#.#
#.#@#
#*#.#
#####
5 6
##.##
#...#
#.#.#
#*#@#
#.#.#
#####
5 6
##.##
#...#
#*#.#
#.#@#
#.#.#
#####
8 9
########
#......#
#.####.#
#.#@.#.#
#.##.#.#
#....#.#
######.#
.......#
########
5 3
##.##
#*.@#
#####
7 7
.......
.*#.##.
.##.##.
...@...
.##.##.
.##.#*.
.......
7 7
......*
.##.##.
.##.##.
...@...
.##.##.
.##.##.
*......
7 7
.*....*
.##.##.
.##.##.
...@...
.##.##.
.##.##.
.*....*
7 7
.......
*##.##*
.##.##.
...@...
.##.##.
.##.##.
*.....*
7 7
*....*.
.##.##.
.##.##.
...@...
.##.##.
.##.##.
*....*.
7 7
*.....*
.##.##.
.##.##.
...@...
.##.##.
*##.##*
.......
7 7
..#.#..
.*#.#*.
.##.##.
...@...
.##.##.
.*#.#*.
.......
7 7
.......
.*#.#*.
.##.###
...@...
.##.###
.*#.#*.
.......
7 7
.......
.*#.#*.
###.##.
...@...
###.##.
.*#.#*.
.......
7 7
.......
.*#.#*.
.##.##.
...@...
.##.##.
.*#.#*.
..#.#..
5 3
..#..
.@#*.
..#..

-------------------------

1
IMPOSSIBLE
2
IMPOSSIBLE
6
5
IMPOSSIBLE
IMPOSSIBLE
28
IMPOSSIBLE
IMPOSSIBLE
IMPOSSIBLE
4
4
4
4
4
4
4
4
2

"""