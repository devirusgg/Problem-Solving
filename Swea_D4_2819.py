# Swea_D4_2819_격자판의 숫자 이어 붙이기
global graph, numbers, dx, dy


def solution():
    global graph, numbers, dx, dy
    graph = []
    for _ in range(4):
        graph.append(list(input().split()))
    numbers = set()
    dx = [0, -1, 0, 1]
    dy = [-1, 0, 1, 0]

    for i in range(4):
        for j in range(4):
            dfs(i, j, graph[i][j])
    return len(numbers)


def dfs(x, y, temp):
    if len(temp) == 7:
        global numbers
        numbers.add(temp)
        return

    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i]
        if 0 <= nx < 4 and 0 <= ny < 4:
            dfs(nx, ny, temp + graph[nx][ny])


if __name__ == '__main__':
    t = int(input())
    for tn in range(1, t + 1):
        print(f"#{tn} {solution()}")
