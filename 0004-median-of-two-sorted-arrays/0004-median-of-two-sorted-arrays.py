class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        first_size = len(nums1)
        second_size = len(nums2)
        total = first_size + second_size

        arr: list[int] = nums1 + nums2
        arr.sort()

        index = total // 2

        if total % 2:
            return float(arr[index])
        return (arr[index - 1] + arr[index]) / 2
