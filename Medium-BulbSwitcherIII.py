#There is a room with n bulbs, numbered from 1 to n, arranged in a row from left to right. Initially, all the bulbs are turned off.
#At moment k (for k from 0 to n - 1), we turn on the light[k] bulb. A bulb change color to blue only if it is on and all the previous bulbs (to the left) are turned on too.
#Return the number of moments in which all turned on bulbs are blue.

import numpy as np
class Solution:
    def numTimesAllBlue(self, light: List[int]) -> int:
        c = 0
        l = len(light)   
        s = 0
        s_i = 0
        helper=[0]*l
        for i in range(l):
            helper[light[i]-1] = i
        for i in range(l):
            s += helper[i]
            s_i += i
            if s == s_i:
                c+=1
        return c
