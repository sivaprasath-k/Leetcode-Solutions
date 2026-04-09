class Solution {
    public boolean canBeEqual(String s1, String s2) {
        int i=0,j=2;
        char[] arr=s1.toCharArray();
        String res=String.valueOf(arr);
        String fin=res;
        while(!res.equals(s2) && j<s2.length()){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            res=String.valueOf(arr);
            i++;
            j++;
        }
        if(res.equals(s2)) return true;
        arr=s1.toCharArray();
        char temp=arr[1];
        arr[1]=arr[s1.length()-1];
        arr[s1.length()-1]=temp;
        res=String.valueOf(arr);
        if(res.equals(s2)) return true;
        return false;
    }
}