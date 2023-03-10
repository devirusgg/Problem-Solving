# JadenCase 문자열 만들기

def solution(s):
    s = s.lower()
    answer = ''
    flag = True

    for i in range(len(s)):
        c = s[i].upper() if flag else s[i]
        flag = True if s[i] == " " else False
        answer += c

    return answer


print(solution("3people   Unfollowed   Me"))
print(solution("  for the last week  "))
