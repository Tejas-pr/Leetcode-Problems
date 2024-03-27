class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        if(str == null || str.length()==0){
            return false;
        }
        str.toLowerCase(); // to lower case
        for(int i=0;i<str.length()/2;i++){
            char Start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);

            if(Start != end){
                return false;
            }
        }
        return true;
    }
}