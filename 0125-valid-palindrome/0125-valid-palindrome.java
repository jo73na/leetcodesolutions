class Solution {
    public boolean isPalindrome(String s) {
        String st=s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int len=st.length();
        int start=0;
        int end=len-1;
        while(start<end){
            if(st.charAt(start)!=st.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}