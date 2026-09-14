class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        # 0,1,2,2,3,0,4,2
        #.    i.        j
        #.    i.       j
        #.    i.     j

        i, j = 0, len(nums) - 1
        count = 0

        while i <= j:
            if nums[i] == val:
                count += 1
                nums[i] = nums[j]
                j -= 1
            else:
                i += 1

        return len(nums) - count           