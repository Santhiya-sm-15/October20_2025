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