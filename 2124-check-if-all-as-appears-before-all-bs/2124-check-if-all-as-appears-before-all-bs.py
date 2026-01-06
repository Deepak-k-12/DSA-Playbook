class Solution:
    def checkString(self, s: str) -> bool:
        l=sorted(list(s))
        m=''.join(l)
        return m==s
 

        