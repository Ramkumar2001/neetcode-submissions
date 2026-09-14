class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mapp = {} # "1000101010" -> ["word"]
        sol = []

        for word in strs:
            freq = [0] * 26
            for c in word:
                freq[ord(c) - ord('a')] += 1
    
            key = ",".join(map(str, freq))
            if key not in mapp:
                mapp[key] = []
            mapp[key].append(word)

        for key, value in mapp.items():
            sol.append(value)

        return sol    
