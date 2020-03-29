//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".

class Solution {
    public boolean check(String prefix, String word){
        int i;
        if(prefix.length()<=word.length()){
            for (i = prefix.length(); i>0; i--){
                if(prefix.charAt(i-1)!=word.charAt(i-1)){
                    return false;
                }
            }
        }
        else{
            return false;
        }
        return true;
    }
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        String longest = strs[0];
        int i,j;
        while(longest.length()>0){
            for(i=1; i<strs.length; i++){
                if(!check(longest, strs[i])){
                    longest = longest.substring(0, longest.length() - 1);
                    break;
                }
                if(i==strs.length-1){
                    return longest;
                }
                
            }
            
        }
        return longest;
    }
}
