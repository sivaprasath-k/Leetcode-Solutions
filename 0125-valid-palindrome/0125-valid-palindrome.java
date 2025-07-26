class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder str=new StringBuilder();
        int ind=0;
        while(ind<s.length()){
            char check=s.charAt(ind);
            if(Character.isLetter(check)){
                str.append(check);
            }
            else if(Character.isDigit(check)){
                str.append(check);
            }
            ind++;
        }
        System.out.print(str);
        String ori=str.toString();
        if(ori.equals(str.reverse().toString())){
            return true;
        }
        return false;
    }
}