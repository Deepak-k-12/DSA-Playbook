class Solution {

    

    public int check(int c,int Ex){
        if(c<Ex){return 0;}

        int new1=c/Ex;
        int rem=c%Ex;
        return new1+check(new1+rem,Ex);
    }

    public int numWaterBottles(int Bot, int Ex) {
        return Bot+check(Bot,Ex);
    }
}