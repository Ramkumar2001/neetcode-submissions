class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mapp = defaultdict(list)
        sol = []

        for word in strs:
            freq = [0] * 26
            for c in word:
                freq[ord(c) - ord('a')] += 1
            mapp[tuple(freq)].append(word) #use tuple because they can be hashed for a dict
        return list(mapp.values())    
