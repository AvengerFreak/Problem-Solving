class Solution(object):
    def candy(self, ratings):
        N = len(ratings)
        candies = [1] * N # start each child with one candy

        # Traverse left to right, give another candy if higher rating
        for i in range(1, N):
            if ratings[i] > ratings[i-1]:
                candies[i] = candies[i-1]+1

        # Traverse right to left, give higher candy than the previous if better rating
        for i in range(N-2, -1, -1):
            if ratings[i] > ratings[i+1]:
                candies[i] = max(candies[i], candies[i+1]+1) # higest rating gets higer candy than neighbor
                
        return sum(candies)
