# 동전 0
n, k = map(int, input().split())

arr = []
for i in range(n):
    arr.append(int(input()))

cnt = 0
for i in reversed(range(n)):
    if arr[i] <= k:
        cnt += k//arr[i]
        k %= arr[i]

    # while (arr[i] <= k):
    #     k -= arr[i]
    #     cnt += 1

print(cnt)
