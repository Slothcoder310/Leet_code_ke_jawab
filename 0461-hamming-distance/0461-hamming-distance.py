class Solution:
    def hammingDistance(self, x: int, y: int) -> int:

        bin_1 = format(x, '032b')
        bin_2 = format(y, '032b')

        count = 0

        for i in range(32):
            if bin_1[i] != bin_2[i]:
                count += 1

        return count