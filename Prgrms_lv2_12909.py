# 올바른 괄호
def solution(s):
    idx = 0
    for i in range(len(s)):
        idx = idx + 1 if s[i] == "(" else idx - 1
        if idx < 0:
            return False

    if idx == 0:
        return True
    else:
        return False


if __name__ == '__main__':
    print(solution("()()"))
    print(solution("(())()"))
    print(solution(")()("))
    print(solution("(()("))
