class Solution {
    public boolean isValid(String word) {
        int a=0,b=0,c=0;
        if(word.length()<3){
            return false;
        }
        else{
            for(int i=0;i<word.length();i++){
                if('0'<=word.charAt(i) && word.charAt(i)<='9'){
                    a++;
                }
                else if(Character.isLetter(word.charAt(i))){
                    char q=Character.toLowerCase(word.charAt(i));
                    if("aeiou".indexOf(q)!=-1){
                        b++;
                    }
                    else{
                        c++;
                    }
                }
                else{
                    return false;
                }
            }
        }
        if(b!=0 && c!=0){
            return true;
        }
        return false;
    }
}