'''
    Given two strings, s and t, return true if t is an anagram of s. Return false otherwise.
    An anagram is a word or phrase formed by rearranging the letters of a different word
    or phrase, using the letters only once.
    Examples:
    Input: s = "anagram", t = "nagaram"
    solve("anagram, nagaram");
    Output: true
    Input: s = "rat", t = "car"
    solve("rat, car");
    Output: false
'''

def is_anagram(word1, word2):

    sorted_word1 = ''.join(sorted(word1.strip()))
    sorted_word2 = ''.join(sorted(word2.strip()))

    if sorted_word1 == sorted_word2:
        return "true"

    return "false"

print(is_anagram("anagram", "nagaram"))