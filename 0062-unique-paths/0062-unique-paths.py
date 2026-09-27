class Solution:
    def uniquePaths(self, m: int, n: int) -> int:

        memo = {(0, 0) : 1}

        def path(i, j):
            if (i, j) in memo:
                return memo[(i,j)]
            elif i < 0 or j < 0 or i == m or j == n:
                return 0
            else:
                val = path(i, j - 1) + path(i - 1, j)
                memo[(i, j)] = val
                return val
        
        return path(m - 1, n - 1)
        