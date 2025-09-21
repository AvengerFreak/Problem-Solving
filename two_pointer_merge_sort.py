class Solution(object):
    def merge(self, nums1, m, nums2, n):

        # Start from the end of both arrays
        i = m - 1  # Last element in nums1's valid part
        j = n - 1  # Last element in nums2
        k = m + n - 1  # Last position in nums1

        # Merge in reverse order
        while i >= 0 and j >= 0:
            if nums1[i] > nums2[j]:
                nums1[k] = nums1[i]
                i -= 1
            else:
                nums1[k] = nums2[j]
                j -= 1
            k -= 1

        # If nums2 is not exhausted, copy remaining elements
        while j >= 0:
            nums1[k] = nums2[j]
            j -= 1
            k -= 1
