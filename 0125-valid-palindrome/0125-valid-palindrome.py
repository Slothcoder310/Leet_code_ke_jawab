class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        string = "".join(char.lower() for char in s if char.isalnum())
        rev_string = string[::-1]

        if string == rev_string:
            return True
        else:
            return False