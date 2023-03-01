# 팰린드롬인지 확인하기
word = input()

frontWord = word[0:len(word) // 2]

backWord = word[-(len(word) // 2):]

if len(word) == 1:
    result = 1
elif frontWord[::-1] == backWord:
    result = 1
else:
    result = 0

print(result)
    