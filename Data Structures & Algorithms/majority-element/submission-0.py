class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        freq = defaultdict(int)
        threshold = len(nums)/2

        for n in nums:
            freq[n] += 1

        for k,v in freq.items():
            if v > threshold:
                return k    