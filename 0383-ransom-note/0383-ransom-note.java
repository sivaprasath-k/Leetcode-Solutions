class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] a=new int[28];
        int[] b=new int[28];
        for(int i=0;i<ransomNote.length();i++){
            int q=(ransomNote.charAt(i)) - 'a';
            a[q]++;
        }
        for(int i=0;i<magazine.length();i++){
            int q=(magazine.charAt(i)) - 'a';
            b[q]++;
        }
        for(int i=0;i<ransomNote.length();i++){
            int q=(ransomNote.charAt(i)) - 'a';
            if(b[q]<a[q]){
                return false;
            }
        }
        return true;
    }
}