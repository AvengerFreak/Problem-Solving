'''
Given two sorted integer arrays, find the median of the arrays.

Example:
Input = [1, 2, 3] and [4, 5]
[1,2,3,4,5]
Output = 3

Example:
Input = [0, 1] and [2, 3]
[0,1,2,3]
Output = (1 + 2)/2 = 1.5

'''

def find_median(arr1, arr2):
        arr_merged = arr1 + arr2
        arr_merged.sort()
        size = len(arr_merged)

        if size%2 == 0:
            return (arr_merged[size//2] + arr_merged[(size//2)-1])/2
            
        return arr_merged[int(size//2)]

print(find_median([0,1], [2,3]))