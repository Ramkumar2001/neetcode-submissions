class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        sMap = {}
        
        for c in s:
            if c not in sMap:
                sMap[c] = 0
            sMap[c] += 1

        for c in t:
            if c not in sMap: 
                return False
            sMap[c] -= 1
            if sMap[c] == 0:
                sMap.pop(c)

        return len(sMap) == 0                   

