class Solution {
    public boolean checkRecord(String s) {
        int countA = 0,cl=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='A'){
                countA++;
                if(countA>1){
                    return false;
                }
            }
            if(c=='L'){
                cl++;
                if(cl>2){
                    return false;
                }
            }else{
                cl=0;
            }   
        }
        return true;
    }
}