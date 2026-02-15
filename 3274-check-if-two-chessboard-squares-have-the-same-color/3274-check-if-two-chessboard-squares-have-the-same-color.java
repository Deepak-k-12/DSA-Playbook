class Solution {
    public boolean checkTwoChessboards(String c1, String c2) {
        String odd="aceg";

        char c1_l=c1.charAt(0);
        int c1_c=c1.charAt(1)-'0';

        char c2_l=c2.charAt(0);
        int c2_c=c2.charAt(1)-'0';

        if(odd.indexOf(c1_l)!=-1 && odd.indexOf(c2_l)!=-1){
            if(c1_c%2!=0 && c2_c%2!=0){
                return true;
            }
            else if(c1_c%2==0 && c2_c%2==0){
                return true;
            }
            else{
                return false;
            }
        }
        else if(odd.indexOf(c1_l)==-1 && odd.indexOf(c2_l)==-1){
            if(c1_c%2==0 && c2_c%2==0){
                return true;
            }
            else if(c1_c%2!=0 && c2_c%2!=0){
                return true;
            }
            else{
                return false;
            }
        }

        else{
            if((c1_c%2==0 && c2_c%2!=0) || (c1_c%2!=0 && c2_c%2==0)){
                return true;
            }
            return false;
        }
       
    }
}