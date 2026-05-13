class Solution {
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        
        StringBuilder sb = new StringBuilder();
        char[] checkS = s.toCharArray();
        
        for (int i = 0; i < checkS.length; i++) {
            if (Character.isLetterOrDigit(checkS[i])) {

                sb.append(Character.toLowerCase(checkS[i]));
            }
        }
        
        String original = sb.toString();
        String reversed = sb.reverse().toString();
        
        return original.equals(reversed);
    }
}
