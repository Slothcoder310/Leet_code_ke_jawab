class Solution:
    def reverseBits(self, n: int) -> int:
        binary = format(n, '032b')

        binary = ''.join(reversed(binary))

        return int(binary,2)