class Solution {
    public boolean isPalindrome(int x) {
        String num=String.valueOf(x);
        //System.out.println(num.length());
        int left=0,right=num.length()-1;
        while(left<=right){
            String fir=String.valueOf(num.charAt(left));
            String sec=String.valueOf(num.charAt(right));
            if(!fir.equals(sec)) return false;
            left++;
            right--;
        }
        return true;
    }
}