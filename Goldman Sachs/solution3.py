class Solution:
    def countSubArrayProductLessThanK(self, a, n, k):
        s=e=res=0
        p=1
        for e in range(n):
            p*=a[e]
            while s<e and p>=k:
                p/=a[s];
                s+=1
            if p<k:
                len=e-s+1
                res+=len
        return res