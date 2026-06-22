class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        first = set()
        count1 = 0
        count2 = 0

        for i in s:
            first.add(i)
            count1+=1

        for i in t:
            if i in first:
                count2+=1
        
        if count1 == count2:
            return True
        else:
            return False


        