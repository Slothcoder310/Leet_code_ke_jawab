import re

class Solution:
    def areNumbersAscending(self, s: str) -> bool:
        prev = 0

        num = [int(x) for x in re.findall(r'\b\d{1,2}\b',s)]

        new_num = sorted(num)

        if new_num == num and len(num) == len(set(new_num)):
            return True
        else:
            return False

        