class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        size = len(s)
        sets = set()
        ans = 0
        left = 0
        right = 0

        while right < size:
            if s[right] not in sets:
                sets.add(s[right])
                ans = max(right - left + 1, ans)
                right += 1
            else:
                sets.remove(s[left])
                left += 1

        return ans

        