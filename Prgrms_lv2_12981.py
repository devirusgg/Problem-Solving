# Prgrms_lv2_12981_영어 끝말잇기
def solution(n, words):
    people = [1 for _ in range(n)]
    selectWord, result = [], []
    idx = 0
    lastChar = words[0][0]

    for word in words:
        if word in selectWord or lastChar != word[0]:
            result.append(idx+1)
            result.append(people[idx])
            return result

        lastChar = word[-1]
        selectWord.append(word)
        people[idx] += 1
        idx += 1
        if idx >= len(people):
            idx = 0

    result = [0, 0]
    return result


if __name__ == '__main__':
    words = ["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]
    print(solution(3, words))
    words = ["hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"]
    print(solution(5, words))
    words = ["hello", "one", "even", "never", "now", "world", "draw"]
    print(solution(2, words))
