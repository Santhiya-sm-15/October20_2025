# October20_2025
The problem that i solved today in leetcode

There is a programming language with only four operations and one variable X:

++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.

Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.

Code:
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        long x=0;
        for(String s:operations)
        {
            if(s.charAt(0)=='-' || s.charAt(s.length()-1)=='-')
                x--;
            else if(s.charAt(0)=='+' || s.charAt(s.length()-1)=='+')
                x++;
        }
        return (int)x;
    }
}
