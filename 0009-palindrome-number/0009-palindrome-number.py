class Solution:
    def isPalindrome(self, x: int) -> bool:
        x = str(x)

        rev_x = "".join(reversed(x))

        if x == rev_x:
            return True
        return False