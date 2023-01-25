'''
There are seven Roman Numerals: I for 1, V for 5, X for 10, L for 50, C for 100, D for 500, and M for 1000.
Given a whole number n, return the roman numeral equivalent as a string.

Example:
Input = 6
Output = VI

Example:
Input = 86
Output = LXXXVI
'''

def convert_to_roman_numeral(decimal):

    num = [1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000]
    sym = ["I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"]
    i = 12
    roman = ""

    while decimal:
        div = decimal // num[i]
        decimal %= num[i]

        while div:
            roman += sym[i]
            div -= 1
        i -= 1

    return roman

print(convert_to_roman_numeral(86))