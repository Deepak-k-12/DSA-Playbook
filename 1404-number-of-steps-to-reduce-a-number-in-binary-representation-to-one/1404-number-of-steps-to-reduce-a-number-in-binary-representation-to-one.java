import java.math.*;
class Solution {
    public int numSteps(String s) {
        BigInteger num=new BigInteger(s,2);
        int []c=new int[1];
        helper(num,c);
        return c[0];
    }

    public void helper(BigInteger num,int []c){
        if(num.equals(BigInteger.valueOf(1))){return ;}
        c[0]++;
        if(num.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(1))){
            helper(num.add(BigInteger.valueOf(1)),c);
        }
        else if(num.mod(BigInteger.valueOf(2)).equals(BigInteger.valueOf(0))){
            helper(num.divide(BigInteger.valueOf(2)),c);
        }
    }

}