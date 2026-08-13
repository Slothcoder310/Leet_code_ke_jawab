import re

class Solution:
    def areNumbersAscending(self, s: str) -> bool:
        prev = 0

        num = [int(x) for x in re.findall(r'\b\d{1,2}\b',s)]

        for i in range(len(num) - 1):
            if num[i] < num[i+1]:
                continue
            else:
                return False

        return True


        