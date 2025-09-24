class Solution {
    public String largestNumber(int[] nums) {
        int len=nums.length;
        Integer[] arr=new Integer[len];
        for(int i=0;i<len;i++) arr[i]=nums[i];
        Arrays.sort(arr,new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                String ab=a+""+b;
                String ba=b+""+a;
                return ba.compareTo(ab);
            }
        });
        if(arr[0]==0) return "0";
        String ans="";
        for(int i=0;i<arr.length;i++) ans+=arr[i];
        return ans;
    }
}