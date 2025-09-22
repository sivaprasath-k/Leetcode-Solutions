class Solution {
    public String[] findRelativeRanks(int[] score) {
        List<Integer> l=new ArrayList<>();
        for(int val:score) l.add(val);
        Collections.sort(l,Collections.reverseOrder());
        String[] ans=new String[score.length];
        int i=0;
        for(int val:score){
            int idx=l.indexOf(val)+1;
            if(idx==1) ans[i]="Gold Medal";
            else if(idx==2) ans[i]="Silver Medal";
            else if(idx==3) ans[i]="Bronze Medal";
            else ans[i]=Integer.toString(idx);
            i++;
        }
        return ans;
    }
}