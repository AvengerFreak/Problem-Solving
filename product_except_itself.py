class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        """
            Prefix product: For each index i, the prefix product is the product of all elements to the left of i.
            Suffix product: For each index i, the suffix product is the product of all elements to the right of i.
            This avoids recalculating products for each index and avoids division (which can cause issues with zeros).
        """

        n = len(nums)
        products = [1]*n

        prefix = 1
        for i in range(n):
            products[i] = prefix
            prefix*= nums[i]

        sufix = 1
        for i in range(n-1, -1, -1):
            products[i]*=sufix
            sufix*= nums[i]

        """
        Breakdown:
            n - 1: Start at the last index of a list of length n.
            -1: Stop before -1 (so the last value is 0).
            -1: Step backwards (decrement by 1 each time).
        """
        return products
