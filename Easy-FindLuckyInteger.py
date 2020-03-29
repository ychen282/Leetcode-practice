class Solution:
    def findLucky(self, arr: List[int]) -> int:
        dict = {}
        count = []
        for i in range(len(arr)):
            num = str(arr[i])
            if num in dict:
                dict[num] += 1
            else:
                dict[num] = 1
        for key in dict:
            if int(key) == dict[key]:
                count += [int(key)]
        if len(count)>0:
            return max(count)
        else:
            return -1
                
            
