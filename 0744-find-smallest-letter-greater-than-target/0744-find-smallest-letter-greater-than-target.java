class Solution {
    public char nextGreatestLetter(char[] l, char t) {
        int left=0,right=l.length-1;
        int mid=left+((right-left)/2);
        char res=l[0];
        while(left<=right){
            mid=left+((right-left)/2);
            if(l[mid]<=t) left=mid+1;
            else if(l[mid]>t){
                res=l[mid];
                right=mid-1;
            }
        }
        return res;
    }
}